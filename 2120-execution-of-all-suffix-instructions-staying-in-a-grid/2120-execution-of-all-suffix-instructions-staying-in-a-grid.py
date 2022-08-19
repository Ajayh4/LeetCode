class Solution:
    def executeInstructions(self, n: int, startPos: List[int], s: str) -> List[int]:
        l=[]
        f=[]
        f.extend(startPos)
        for i in range(len(s)):
            c=0
            startPos=copy.deepcopy(f)
            for j in range(i,len(s)):
                if s[j]=='R':
                    startPos[1]+=1
                    if startPos[1]>=n:
                        break
                elif s[j]=='L':
                    startPos[1]-=1
                    if startPos[1]<=-1:
                        break
                elif s[j]=='U':
                    startPos[0]-=1
                    if startPos[0]<=-1:  
                        break
                else:
                    startPos[0]+=1
                    if startPos[0]>=n:
                        break
                c+=1
            l.append(c)
        return l