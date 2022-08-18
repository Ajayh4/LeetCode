class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        l=[]
        def rod(p):
            for i in p:
                if i.islower():
                    if i.upper() not in p:
                        return False
                else:
                    if i.lower() not in p:
                        return False
            return True
        for i in range(len(s)):
            for j in range(len(s),-1,-1):
                if rod(s[i:j]) and s[i:j]!='':
                    l.append(s[i:j])
        if l!=[]:
            c=''
            for i in l:
                if len(i)>len(c):
                    c=i
            return c
        return ''