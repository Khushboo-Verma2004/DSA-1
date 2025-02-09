class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        for pp, ss in sorted(zip(position, speed), reverse=True):
            tt = (target - pp) / ss  # Time to reach the target
            if not stack or tt > stack[-1]:
                stack.append(tt)
        return len(stack)
