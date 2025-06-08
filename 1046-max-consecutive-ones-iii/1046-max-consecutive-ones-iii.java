class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0;
        int zc=0,n=nums.length;
        while(j<n)
        {
            if(nums[j]==0)
            zc+=1;
            if(zc>k)
            {
                while(i<=j && zc>k)
                {
                    if(nums[i]==0)
                    zc-=1;
                    i+=1;
                }
            }
            ans=Math.max(ans,j-i+1);
            j+=1;
        }
        // ans=Math.max(ans,j-i+1);
        return ans;
    }
}