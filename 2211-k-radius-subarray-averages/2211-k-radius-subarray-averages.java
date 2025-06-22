class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        int i=0;
        long s=0;
        for(i=0;i<2*k+1 && i<n;i++)
        {
            s+=nums[i];
        }
        int j=0,ind=k;
        if((2*k)>=n)
        return ans;
        if(ind>=0 && ind<n)
        ans[ind++]=(int)(s/(2*k+1));
        while(i<n)
        {
            s+=nums[i++];
            s-=nums[j++];
            ans[ind++]=(int)(s/(2*k+1));
        }
        return ans;
    }
}