class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0,mod=(int)Math.pow(10,9)+7;
        int dp[]=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++)
        dp[i]=2*dp[i-1]%mod;
        int l=0,r=n-1;
        while(l<=r)
        {
            if(nums[r]+nums[l]>target)
            r-=1;
            else
            {
                ans=(ans%mod+dp[r-l]%mod)%mod;
                l+=1;
            }
        }
        // System.out.println(ans);
        return ans%mod;
    }
}