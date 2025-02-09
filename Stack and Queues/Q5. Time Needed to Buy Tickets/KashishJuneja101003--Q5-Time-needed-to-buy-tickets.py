class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        queue = deque(enumerate(tickets))  # Store (index, tickets)
        time = 0

        while queue:
            i, t = queue.popleft()
            time += 1
            if t - 1 > 0:
                queue.append((i, t - 1))
            if i == k and t == 1:
                return time  # Stop when `k` buys their last ticket
