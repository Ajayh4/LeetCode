class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        l=[]
        p=[]
        k=[]
        for i in range(len(nums)):
            if i%2==0:
                l.append(nums[i])
            else:
                p.append(nums[i])
        l.sort()
        p.sort(reverse=True)
        if len(nums)==1:
            return nums
        if len(l)==len(p):
            for i in range(len(l)):
                k.append(l[i])
                k.append(p[i])   
            return k
        elif len(l)<len(p):
            for i in range(len(l)):
                k.append(l[i])
                k.append(p[i])
            k.append(p[i+1])
            return k
        else:
            for i in range(len(p)):
                k.append(l[i])
                k.append(p[i])
            k.append(l[i+1])
            return k