class Solution {
    public double myPow(double x, int n) {
        double tmp=1;
        double val=n;
        boolean neg=false;
        if(n<0)
        {
            neg=true;
            val=new Double(n*-1.0);
        }
        while(val>0)
        {
            if(val%2==0)
            {
                val=val/2;
                x*=x;
            }
            else
            {
                tmp*=x;
                val-=1;
            }
        }
        if(neg)
        return (1.0/tmp);
        return tmp;
    }
}