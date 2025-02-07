class Solution:
    def search(self, nums, target):
        low = 0
        high = len(nums) - 1
        return self.binary_search(nums, target, low, high)
    
    def binary_search(self, nums, target, low, high):
        if low > high:
            return -1
        mid = low + (high - low) // 2
        if nums[mid] == target:
            return mid
        if nums[low] <= nums[mid]:
            if nums[low] <= target < nums[mid]:
                return self.binary_search(nums, target, low, mid - 1)
            else:
                return self.binary_search(nums, target, mid + 1, high)
        else:
            if nums[mid] < target <= nums[high]:
                return self.binary_search(nums, target, mid + 1, high)
            else:
                return self.binary_search(nums, target, low, mid - 1)
