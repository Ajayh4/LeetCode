class Solution:
    def largestGoodInteger(self, num: str) -> str:
        l=[]
        def gfg(s):
            if s.count(s[0])==3:
                return True
        for i in range(len(num)-2):
            if gfg(num[i:i+3]):
                l.append(num[i:i+3])
        if l==[]:
            return ""
        else:
            return(max(l))