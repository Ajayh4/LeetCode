class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        c=0
        l=[]
        for i in s:
            if i=='(':
                l.append('(')
            else:
                if l!=[] and l[len(l)-1]=='(':
                    l.pop()
                else:
                    l.append(i)
        return len(l)