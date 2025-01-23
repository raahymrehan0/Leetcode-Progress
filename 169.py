class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        if len(nums) < 1:
            return []
        elif len(nums) == 1:
            return nums[0]
        nums.sort()
        return nums[len(nums) // 2]