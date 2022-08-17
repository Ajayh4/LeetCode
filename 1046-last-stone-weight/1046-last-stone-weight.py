class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        arr=stones
        while(len(arr)>=1):
            if len(arr)==1:
                return arr[0]
            p=max(arr)
            arr.remove(p)
            f=max(arr)
            arr.remove(f)
            if p!=f:
                arr.append(abs(p-f))
        if arr==[]:
            return 0
        else:
            return arr[0]
        