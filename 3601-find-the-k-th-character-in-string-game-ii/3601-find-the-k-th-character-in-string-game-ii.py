class Solution:
    def kthCharacter(self, k: int, operations: List[int]) -> str:
        n=len(operations)
        i=n-1
        tc=2**n
        cnt=0
        while(i>=0):
            h=tc//2
            if k>h:
                k-=h
                if operations[i]==1:
                    cnt+=1
            i-=1
            tc/=2
        cnt=cnt%26
        return chr(ord('a')+cnt)
        