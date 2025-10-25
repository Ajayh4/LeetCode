class Solution {
    public int totalMoney(int n) {
        int cnt=0,ans=0;
        while(n>=7)
        {
            ans+=28;
            if(cnt>0)
            ans+=(cnt*7);
            cnt+=1;
            n-=7;
            // System.out.println(ans);
        }
        ans+=(n*(n+1))/2;
        ans+=(cnt*n);
        return ans;
    }
}