class Solution(object):
    def verticalTraversal(self, root):
        res = []
        frontier = [(root, 0)]
        h = collections.defaultdict(list)
        while frontier:
            next = []
            for u, x in frontier:
                h[x].append(u.val)
                if u.left: next.append((u.left, x-1)) 
                if u.right: next.append((u.right, x+1))
                next.sort(key = lambda x: (x[1], x[0].val))
            frontier = next
        for k in sorted(h):
            res.append(h[k])
        return res
