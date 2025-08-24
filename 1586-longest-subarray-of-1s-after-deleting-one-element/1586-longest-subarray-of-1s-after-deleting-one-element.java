class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length,ans=0;
        int lps[]=new int[n];
        int rps[]=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            cnt=0;
            else
            cnt+=1;
            lps[i]=cnt;
            ans=Math.max(ans,cnt-1);
        }
        cnt=0;
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==0)
            cnt=0;
            else
            cnt+=1;
            rps[i]=cnt;
            ans=Math.max(ans,cnt-1);
        }
        for(int i=0;i<n;i++)
        {
            int val=0;
            if(i!=0)
            val+=lps[i-1];
            if(i!=(n-1))
            val+=rps[i+1];
            ans=Math.max(ans,val);
        }
        return ans;
    }
}