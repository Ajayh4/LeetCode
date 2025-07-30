class Solution {
    static void rec(int ind,int nums[], int val, HashMap<Integer,Integer> hm)
    {
        if(ind>=nums.length)
        {
            hm.put(val,hm.getOrDefault(val,0)+1);
            return;
        }
        rec(ind+1,nums,(val|nums[ind]),hm);
        rec(ind+1,nums,val,hm);
    }
    public int countMaxOrSubsets(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        rec(0,nums,0,hm);
        int ans=0;
        for(int i: hm.keySet())
        {
            ans=Math.max(ans,hm.get(i));
        }
        System.out.println(hm);
        return ans;
    }
}