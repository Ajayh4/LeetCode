class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int ind=-1;
        Arrays.fill(ans,-1);
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(nums[m]==target)
            {
                ind=m;
                break;
            }
            else if(nums[m]>target)
            h=m-1;
            else
            l=m+1;
        }
        if(ind==-1)
        return ans;
        int tx=ind,ty=ind;
        while(tx>0 && nums[tx]==nums[tx-1])
        tx-=1;
        while(ty<h && nums[ty]==nums[ty+1])
        ty+=1;
        ans[0]=tx;
        ans[1]=ty;
        return ans;
    }
}