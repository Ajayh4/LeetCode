class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        p=[]
        l=[]
        m=[]
        for i in nums:
            if i>0:
                p.append(i)
            else:
                l.append(i)
        for i in range(len(p)):
            m.append(p[i])
            m.append(l[i])
        return m
            