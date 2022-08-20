class Solution:
    def makeGood(self, s: str) -> str:
        l=['aA','bB','cC','dD','eE','fF','gG','hH','iI','jJ','kK','lL','mM','nN','oO','pP','qQ','rR','sS','tT','uU','vV','wW','xX','yY','zZ']
        p=''
        while(True):
            p=s
            for i in l:
                if i in s:
                    s=s.replace(i,'')
                if i[::-1] in s:
                    s=s.replace(i[::-1],'')
            if s==p:
                return s
        return s