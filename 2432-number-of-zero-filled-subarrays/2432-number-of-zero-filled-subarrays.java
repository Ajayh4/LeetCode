class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++)
        {
            // System
            if(nums[i]==0)
            {
                int j=i+1;
                long cnt=1;
                while(j<n)
                {
                    if(nums[j]==0)
                    cnt+=1;
                    else
                    break;
                    j+=1;
                }
                ans+=(cnt*(cnt+1))/2;
                i=j-1;
            }
        }
        return ans;
    }
}