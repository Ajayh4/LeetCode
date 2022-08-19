class Solution:
    def checkArithmeticSubarrays(self, nums: List[int], l: List[int], r: List[int]) -> List[bool]:
        def aseq(a):
            a.sort()
            p=a[1]-a[0]
            for i in range(len(a)-1):
                if a[i+1]-a[i]!=p:
                    return False
            return True
        k=[]
        for i in range(len(l)):
            k.append(aseq(nums[l[i]:r[i]+1]))

        return k