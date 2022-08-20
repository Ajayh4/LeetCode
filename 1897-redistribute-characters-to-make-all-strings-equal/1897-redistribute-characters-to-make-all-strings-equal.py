class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        s=''
        for i in words:
            for j in i:
                s+=j
        for i in s:
            if s.count(i)%len(words)!=0:
                return False
        return True