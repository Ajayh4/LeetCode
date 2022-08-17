class Solution:
    def trimMean(self, arr: List[int]) -> float:
        p=int(0.05*len(arr))
        for i in range(p):
            arr.remove(min(arr))
            arr.remove(max(arr))
        return sum(arr)/len(arr)