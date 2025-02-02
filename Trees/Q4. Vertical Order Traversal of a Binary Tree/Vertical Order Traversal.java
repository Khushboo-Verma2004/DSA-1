import java.util.*;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        value = x;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, List<int[]>> map = new HashMap<>(); //map to store column indexes with row value pairs.
        Queue<Pair<TreeNode, int[]>> q = new LinkedList<>(); //This queue stores row, col with the node
        
        q.offer(new Pair<>(root, new int[]{0, 0})); //root node
        int min = 0;
        int max = 0;
        
        while(!q.isEmpty()) {
            Pair<TreeNode, int[]> curr = q.poll();
            TreeNode node = curr.getKey(); //Extracts the treenode from the pair.
            int row = curr.getValue()[0];
            int col = curr.getValue()[1];
            
            if (!map.containsKey(col)) {
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(new int[]{row, node.value}); //store row, node value alongside the column in the map.
            
            min = Math.min(min, col);
            max = Math.max(max, col);
            
            if(node.left != null){
                q.offer(new Pair<>(node.left, new int[]{row + 1, col - 1}));
            }
            if(node.right != null){
                q.offer(new Pair<>(node.right, new int[]{row + 1, col + 1}));
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i = min; i <= max; i++) {
            List<int[]> nodes = map.get(i);
            Collections.sort(nodes, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]); // Sort by row first, then by value
            
            List<Integer> values = new ArrayList<>();
            for(int[] x : nodes) {
                values.add(x[1]);
            }
            res.add(values);
        }
        return res;
    }
}

