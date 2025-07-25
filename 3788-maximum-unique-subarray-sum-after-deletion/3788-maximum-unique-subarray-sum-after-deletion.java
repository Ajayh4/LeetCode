class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int f=1,mi=nums[0];
        for(int i: nums)
        {
            if(i>0){
            hs.add(i);
            f=0;
            }
            mi=Math.max(mi,i);
        }
        if(f==1)return mi;
        int ans=0;
        for(int i: hs)
        ans+=i;
        return ans;
    }
}