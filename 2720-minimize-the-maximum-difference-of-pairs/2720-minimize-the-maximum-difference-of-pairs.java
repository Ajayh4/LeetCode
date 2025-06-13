class Solution {
    static boolean find(int nums[],int p,int m)
    {
        int ind=0,cnt=0;
        while(ind<nums.length-1)
        {
            if(nums[ind+1]-nums[ind]<=m){
            cnt+=1;
            ind+=2;
            }
            else
            ind+=1;
        }
        if(cnt>=p)return true;
        return false;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,h=nums[n-1]-nums[0];
        int ans=Integer.MAX_VALUE;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(find(nums,p,m))
            {
                // System.out.println(m);
                ans=Math.min(ans,m);
                h=m-1;
            }
            else
            l=m+1;
        }
        return ans;
    }
}