class Solution {
    public long countCommas(long n) {
        if(n<1000)
        return 0;
        long ans=0;
        long tmp=100;
        while(tmp*10<=n)
        {
            tmp*=10;
            long count=Math.min((tmp*10-1),n)-tmp+1;
            long length=(long)Math.log10(tmp)+1;
            ans+=((length-1)/3*count);
        }
        return ans;
    }
}