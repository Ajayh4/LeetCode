class Solution:
    def repeatedCharacter(self, s: str) -> str:
        p=dict()
        for i in s:
            if i not in p.keys():
                p[i]=1
            else:
                p[i]+=1
                if p[i]==2:
                    return i