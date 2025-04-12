class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0,ans=0;
        // Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: nums)
        {
            s+=i;
            if(s==k)ans+=1;
            if(hm.containsKey(s-k)){
            ans+=hm.get(s-k);
            }
            if(hm.containsKey(s))
            hm.put(s,hm.get(s)+1);
            else
            hm.put(s,1);
            // System.out.println(hm);
        }
        return ans;
    }
}