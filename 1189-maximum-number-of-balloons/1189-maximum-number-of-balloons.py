class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        s=text
        b=s.count('b')
        a=s.count('a')
        l=s.count('l')
        o=s.count('o')
        n=s.count('n')
        return(min(b,a,l//2,o//2,n))