class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length,i=0,j=n-1;
        while(i<j)
        {
            while(i<n && nums[i]==0)
            i+=1;
            while(j>i && nums[j]!=0)
            j-=1;
            if(i<j)
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i+=1;
                j-=1;
            }
        }
        // System.out.println(Arrays.toString(nums));
        i=0;
        j=n-1;
        while(i<n && nums[i]==0)
        i+=1;
        // System.out.println(i+" "+j);
        while(i<j)
        {
            while(i<n && nums[i]==1)
            i+=1;
            while(j>i && nums[j]!=1)
            j-=1;
            if(i<j)
            {
                // System.out.println(i+" "+j);
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i+=1;
                j-=1;
            }
        }
    }
}