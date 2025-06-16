class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int pre[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
            pre[i]=s;
        }
        ans[0]=(pre[n-1]-(n*nums[0]));
        ans[n-1]=((n-1)*nums[n-1]-pre[n-2]);
        for(int i=1;i<n-1;i++)
        {
            ans[i]+=(pre[n-1]-pre[i]-(n-i-1)*nums[i]);
            ans[i]+=(i*nums[i]-pre[i-1]);
        }
        return ans;
    }
}