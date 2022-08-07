class Solution:
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        p=dict()
        for i in range(highLimit+1):
            p[i]=0
        for i in range(lowLimit,highLimit+1):
            if i<=9:
                p[i]+=1
            else:
                c=0
                for j in str(i):
                    c+=int(j)
                p[c]+=1
        return max(p.values())