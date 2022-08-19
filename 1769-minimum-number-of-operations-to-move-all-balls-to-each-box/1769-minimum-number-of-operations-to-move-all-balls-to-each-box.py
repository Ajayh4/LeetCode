class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        l=[]
        for i in range(len(boxes)):
            c=0
            for j in range(len(boxes)):
                if boxes[j]=='1':
                    c+=abs(j-i)
            l.append(c)
        return l