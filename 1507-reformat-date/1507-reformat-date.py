class Solution:
    def reformatDate(self, date: str) -> str:
        date=date.split(' ')
        s=''
        p=["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
        s+=date[2]
        s+='-'
        j=(p.index(date[1])+1)
        if j<10:
            s+='0'+str(j)+'-'
        else:
            s+=str(j)+'-'
        try:
            d=int(date[0][:2])
            s+=date[0][:2]
        except:
            s+='0'+date[0][:1]
        return s
        