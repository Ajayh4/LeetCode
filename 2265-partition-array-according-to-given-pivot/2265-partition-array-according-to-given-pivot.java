class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int ans[]=new int[n];
        int i=0,j=n-1,l=0,r=n-1;
        while(i<n && j>=0)
        {
            if(nums[i]<pivot)
            ans[l++]=nums[i];
            i+=1;
            if(nums[j]>pivot)
            ans[r--]=nums[j];
            j-=1;
            // System.out.println(Arrays.toString(ans));
        }
        // l+=1;
        while(l<=r)
        ans[l++]=pivot;
        return ans;
    }
}