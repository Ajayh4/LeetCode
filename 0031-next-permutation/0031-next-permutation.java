class Solution {
    public void nextPermutation(int[] nums) {
        int ti=-1,n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
                ti=i;
                break;
            }
        }
        if(ti==-1)
        {
            int j=0,k=n-1;
            while(j<k)
            {
                int t=nums[j];
                nums[j]=nums[k];
                nums[k]=t;
                j+=1;
                k-=1;
                // System.out.println(j+" "+k);
            }
            return;
        }
        // System.out.println("kjbdkfvb");
        for(int j=n-1;j>=ti;j--)
        {
            if(nums[j]>nums[ti])
            {
                int t=nums[ti];
                nums[ti]=nums[j];
                nums[j]=t;
                break;
            }
        }
        int j=ti+1,k=n-1;
        while(j<k)
        {
            int t=nums[j];
            nums[j]=nums[k];
            nums[k]=t;
            j+=1;
            k-=1;
        }
    }
}