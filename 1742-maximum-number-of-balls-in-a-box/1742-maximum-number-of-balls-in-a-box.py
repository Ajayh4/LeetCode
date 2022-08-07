class Solution:
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        p=dict()
        for i in range(lowLimit,highLimit+1):
            if i<=9:
                if i not in p:
                    p[i]=1
                else:
                    p[i]+=1
            else:
                c=0
                for j in str(i):
                    c+=int(j)
                if c not in p:
                    p[c]=1
                else:
                    p[c]+=1
        return max(p.values())