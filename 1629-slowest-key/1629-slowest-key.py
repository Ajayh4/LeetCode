class Solution:
    def slowestKey(self, releaseTimes: List[int], keysPressed: str) -> str:
        l=[releaseTimes[0]]
        for i in range(len(releaseTimes)-1):
            l.append(releaseTimes[i+1]-releaseTimes[i])
        if l.count(max(l))>1:
            p=[]
            for i in range(len(l)):
                if l[i]==max(l):
                    p.append(keysPressed[i])
            return max(p)
        else:
            return keysPressed[l.index(max(l))]
                    