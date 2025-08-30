class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int lm[]=nums.clone();
        int rm[]=nums.clone();
        lm[0]=nums[0];
        rm[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        lm[i]=Math.min(lm[i],lm[i-1]);
        for(int i=n-2;i>=0;i--)
        rm[i]=Math.max(rm[i],rm[i+1]);
        // System.out.println(Arrays.toString(lm));
        // System.out.println(Arrays.toString(rm));
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]>lm[i] && nums[i]<rm[i])
            return true;
        }
        return false;
    }
}