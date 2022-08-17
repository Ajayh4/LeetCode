class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        l=[]
        p=[]
        f=[]
        for i in range(len(nums)):
            if nums[i]==key:
                p.append(i)
        for i in range(len(nums)):
            for j in p:
                if abs(i-j)<=k:
                    f.append(i)
                    break
        return f