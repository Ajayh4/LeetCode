class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        def gfg(a):
            if a==sorted(a):
                if len(set(a))==len(a):
                    return True
                else:
                    return False
            else:
                return False
        p=0
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if gfg(nums[i:j+1]):
                    p=max(sum(nums[i:j+1]),p)
        return p