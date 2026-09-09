class Solution {
    public int countCommas(int n) {
        if(n<1000)
        return 0;
        int ans=0;
        int tmp=100;
        while(tmp*10<=n)
        {
            tmp*=10;
            int count=Math.min((tmp*10-1),n)-tmp+1;
            int length=(int)Math.log10(tmp)+1;
            ans+=((length-1)/3*count);
        }
        
        return ans;
    }
}