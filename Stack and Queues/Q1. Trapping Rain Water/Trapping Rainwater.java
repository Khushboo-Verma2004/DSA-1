class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[]left = new int[n]; //Stores max height to the left of the position.
        int[]right = new int[n]; //Stores max height to the right of the position.
        left[0] = height[0];
        for(int i = 1; i<n; i++ ){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int volume = 0;
        for(int i = 0; i<n; i++){
            volume+= Math.min(left[i], right[i])-height[i]; //Calculates how much water can be trapped at the current position.
        }
        return volume;
    }
}
//O(n) time and O(n) space
