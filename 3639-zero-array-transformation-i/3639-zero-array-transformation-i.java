class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int tmp[]=new int[n+1];
        for(int i[]: queries)
        {
            tmp[i[0]]-=1;
            tmp[i[1]+1]+=1;
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=tmp[i];
            tmp[i]=s;
            if((tmp[i]+nums[i])>0)
            return false;
        }
        return true;
    }
}