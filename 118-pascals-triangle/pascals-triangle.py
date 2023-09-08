class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        n=numRows
        if n==1:
            return [[1]]
        elif n==2:
            return [[1],[1,1]]
        else:
            l=[[1],[1,1]]
            for i in range(2,n):
                k=[1]
                for j in range(len(l[i-1])-1):
                    k.append(l[i-1][j]+l[i-1][j+1])
                k.append(1)
                l.append(k)
            return l