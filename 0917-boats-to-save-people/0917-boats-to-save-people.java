class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int n=nums.length,l=0,h=n-1,ans=0;
        while(h>=0 && nums[l]+nums[h]>limit)
        {
            h-=1;
            ans+=1;
        }
        while(l<=h)
        {
            if(nums[l]+nums[h]<=limit){
                ans+=1;
                l+=1;
                h-=1;
            }
            else
            {
                // l+=1;
                h-=1;
                ans+=1;
            }
        }
        return ans;
    }
}