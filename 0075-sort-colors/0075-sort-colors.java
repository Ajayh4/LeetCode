class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        for(int i: nums)
        {
            if(i==0)
            a+=1;
            else if(i==1)
            b+=1;
            else
            c+=1;
        }
        int i=0;
        for(int j=0;j<a;j++)
        nums[i++]=0;
        for(int j=0;j<b;j++)
        nums[i++]=1;
        for(int j=0;j<c;j++)
        nums[i++]=2;
    }
}