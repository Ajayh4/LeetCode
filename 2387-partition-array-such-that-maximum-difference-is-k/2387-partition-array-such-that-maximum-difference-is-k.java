class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length,ans=0,mi=nums[0];
        for(int i=1;i<n;i++)
        {
            if((nums[i]-mi)<=k)
            {
                continue;
            }
            else{
            mi=nums[i];
            ans+=1;
            }
        }
        return ans+1;
    }
}