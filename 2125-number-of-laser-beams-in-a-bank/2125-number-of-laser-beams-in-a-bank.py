class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        l=[]
        c=0
        for i in bank:
            if i.count('1')>0:
                l.append(i.count('1'))
        for i in range(len(l)-1):
            c+=l[i]*l[i+1]
        return c