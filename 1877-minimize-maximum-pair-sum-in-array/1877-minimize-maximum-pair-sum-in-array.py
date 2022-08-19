class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        l=0
        nums.sort()
        n=len(nums)
        for i in range(len(nums)//2):
            l=max((nums[i]+nums[n-i-1]),l)
        return l