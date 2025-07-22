class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int pf[]=new int[n];
        int ts=0,m=nums[0],pr=-1;
        for(int i=0;i<n;i++)
        {
            int v=nums[i];
            ts+=v;
            pf[i]=ts;
            if(hm.containsKey(nums[i]))
            {
                int ind=hm.get(nums[i]);
                if(pr==-1 || ind>pr){
                m=Math.max(m,ts-pf[ind]);
                pr=ind;
                }
            }
            hm.put(nums[i],i);
            if(pr==-1)
            m=Math.max(m,ts);
            else
            m=Math.max(m,ts-pf[pr]);
        }
        return m;
    }
}