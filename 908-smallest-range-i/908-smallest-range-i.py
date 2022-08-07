class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        l=max(nums)
        p=min(nums)
        if ((l-p)-2*k)<=0:
            return 0
        else:
            return (l-p)-2*k