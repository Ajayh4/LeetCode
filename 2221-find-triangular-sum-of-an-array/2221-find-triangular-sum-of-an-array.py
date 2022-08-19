class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        l=[]
        while(len(nums)!=1):
            l=[]
            for i in range(len(nums)-1):
                if nums[i]+nums[i+1]>=10:
                    l.append((nums[i]+nums[i+1])%10)
                else:
                    l.append(nums[i]+nums[i+1])
            nums=l
        return nums[0]