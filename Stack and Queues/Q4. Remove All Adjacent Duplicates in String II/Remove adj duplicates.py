class Solution(object):
    def removeDuplicates(self, s, k):
        queue = deque()
        for c in s:
            if queue and queue[-1][0] == c:
                queue[-1][1] += 1 
                if queue[-1][1] == k:
                    queue.pop() 
            else:
                queue.append([c, 1]) 
        
        return ''.join(c * cnt for c, cnt in queue)
