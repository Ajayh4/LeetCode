class Solution:
    def reformat(self, s: str) -> str:
        n=''
        a=''
        p=''
        for i in s:
            if i.isalpha():
                n+=i
            else:
                a+=i
        if abs(len(n)-len(a))>1:
            return ""
        if len(a)==len(n):
            for i in range(len(a)):
                p+=(n[i]+a[i])
            return p
        elif len(n)>len(a):
            for i in range(len(a)):
                p+=n[i]+a[i]
            p+=n[len(n)-1]
            return p
        else:
            for i in range(len(n)):
                p+=a[i]+n[i]
            p+=a[len(a)-1]
            return p