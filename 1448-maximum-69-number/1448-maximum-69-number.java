class Solution {
    public int maximum69Number (int num) {
        int s=0,f=1;
        int nd=(int)Math.log10(num);
        while(num!=0)
        {
            int r=num/(int)Math.pow(10,nd);
            // System.out.println(r+" "+f);
            if(r==6 && f==1)
            {
                f=0;
                s=(int)Math.pow(10,nd)*9+s;
            }
            else
            s=(int)Math.pow(10,nd)*r+s;
            num-=r*(int)Math.pow(10,nd);
            nd-=1;
        }
        return s;
    }
}