class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        l=[]
        p=''
        for i in s:
            if ord(i) in range(65,91) or ord(i) in range(97,123):
                l.append(i)
        l=l[::-1]
        j=0
        for i in s:
            if 65<=ord(i)<=90 or 97<=ord(i)<=123:
                p+=l[j]
                j+=1
            else:
                p+=i
        return p