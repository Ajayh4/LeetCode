class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        c=0
        while(True):
            for i in range(nums.count(0)):
                nums.remove(0)
            if nums==[]:
                return c
            p=min(nums)
            for i in range(len(nums)):
                nums[i]-=p
            c+=1
        return c