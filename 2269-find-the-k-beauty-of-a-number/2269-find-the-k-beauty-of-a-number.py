class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        p=str(num)
        c=0
        for i in range(len(p)-k+1):
            try:
                if num%int(p[i:i+k])==0:
                    c+=1
            except:
                c+=0
        return c 