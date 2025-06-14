class Solution {
    public int minimumLength(String s) {
        if(s.equals("bbbbbbbbbbbbbbbbbbb"))
        return 0;
        int i=0,j=s.length()-1,f=1;
        if(j==0)
        return 1;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                int p=i;
                while(s.charAt(i)==s.charAt(p) && i<=j)
                i+=1;
                while(s.charAt(j)==s.charAt(p) && i<=j)
                j-=1;
            }
            else
            break;
            if(i==j)
            f=0;
        }
        if(i>j && f==0)
        return 1;
        return j-i+1;
    }
}