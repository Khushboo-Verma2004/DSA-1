from collections import deque

class Solution:
    def asteroidCollision(self, asteroids):
        queue = deque()
        
        for asteroid in asteroids:
            destroyed = False
            
            while queue and asteroid < 0 and queue[-1] > 0:
                if queue[-1] < -asteroid:
                    queue.pop()
                    continue
                elif queue[-1] == -asteroid:
                    queue.pop()
                destroyed = True
                break
            
            if not destroyed:
                queue.append(asteroid)
        
        return list(queue)
