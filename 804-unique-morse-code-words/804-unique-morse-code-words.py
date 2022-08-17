class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        l=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        p=[]
        for i in words:
            s=''
            for j in i:
                s+=l[ord(j)-97]
            if s not in p:
                p.append(s)
        return len(p)
                
