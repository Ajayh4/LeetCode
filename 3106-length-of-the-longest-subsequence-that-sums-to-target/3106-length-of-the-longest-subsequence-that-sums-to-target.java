class Solution {
    static int rec(int ind,List<Integer> nums,int t,int dp[][])
    {
        if(t==0)
        return 0;
        if(ind>=nums.size())
        return Integer.MIN_VALUE;
        if(dp[ind][t]!=-1)
        return dp[ind][t];
        int ans=Integer.MIN_VALUE;
        if(t-nums.get(ind)>=0)
            ans=Math.max(ans,1+rec(ind+1,nums,t-nums.get(ind),dp));
        ans=Math.max(ans,rec(ind+1,nums,t,dp));
        return dp[ind][t]=ans;
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n=nums.size();
        int dp[][]=new int[n][target+1];
        for(int i[]: dp)
        Arrays.fill(i,-1);
        int ans=rec(0,nums,target,dp);
        return (ans<0)?-1:ans;
    }
}