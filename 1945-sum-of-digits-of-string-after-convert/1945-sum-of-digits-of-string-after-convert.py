class Solution:
    def getLucky(self, s: str, k: int) -> int:
        p=''
        for i in s:
            p+=str(ord(i)-96)
        for i in range(k):
            s=0
            for j in p:
                s+=int(j)
            p=str(s)
        return s
                