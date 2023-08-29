class Solution {
    public int bestClosingTime(String cu) {
        int i=0,ans=Integer.MIN_VALUE,c=0,ind=0;
        for(i=0;i<cu.length();i++)
        {
            if(cu.charAt(i)=='Y')
            c+=1;
            else
            {
                if(c>ans)
                {
                    ans=c;
                    ind=i;
                }
                c-=1;
            }
        }   
        if(c>ans)
        {
            ans=c;
            ind=i;
        } 
        return ind;
    }
}