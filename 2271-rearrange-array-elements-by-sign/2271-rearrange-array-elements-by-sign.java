class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int i=0,j=1;
        for(int k: nums)
        {
            if(k>0){
                ans[i]=k;
                i+=2;
            }
            else
            {
                ans[j]=k;
                j+=2;
            }
        }
        return ans;
    }
}