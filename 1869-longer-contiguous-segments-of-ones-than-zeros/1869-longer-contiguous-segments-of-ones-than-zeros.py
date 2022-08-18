class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        d=0
        c=0
        d1=0
        c1=0
        if s.count('1')==len(s):
            return True
        for i in range(len(s)-1):
            if s[i]=='1' and s[i+1]=='1':
                c+=1
                d=max(d,c)
            else:
                c=0
        for i in range(len(s)-1):
            if s[i]=='0' and s[i+1]=='0':
                c1+=1
                d1=max(d1,c1)
            else:
                c1=0
        if d>d1:
            return True
        else:
            return False
        
        