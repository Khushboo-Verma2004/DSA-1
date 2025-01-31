class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        count=0
        for i in reversed(range(2,len(nums))):
            r=i-1
            l=0
            while l<r:
                if(nums[r]+nums[l]>nums[i]):
                    count+=r-l
                    r-=1
                else:
                    l+=1
        return count
