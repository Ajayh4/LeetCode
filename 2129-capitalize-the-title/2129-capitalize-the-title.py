class Solution:
    def capitalizeTitle(self, title: str) -> str:
        p=title.split(' ')
        f=''
        for i in p:
            if len(i)>2:
                f+=i.title()+' '
            else:
                f+=i.lower()+' '
        return f.strip()