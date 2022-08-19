class Solution:
    def minOperations(self, n: int) -> int:
        l=[1,2]
        i=2
        c=2
        for i in range(2,n):
            l.append(i+l[len(l)-1])
            l.append(i+l[len(l)-1])
            c+=1
        if n==1:
            return 0
        return(l[n-2])