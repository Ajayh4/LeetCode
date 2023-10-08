class Solution {
    static int rec(int i,int nums[],ArrayList<Integer> a,int c,int dp[])
    {
        if(i>=nums.length)
        return c;
        if(dp[i]!=-1)
        return dp[i];
        int e=0,f=0;
        if(a.size()==0)
        {
            a.add(nums[i]);
            e=rec(i+1,nums,a,c+1,dp);
            a.remove(a.size()-1);
        }
        else
        {
            if(nums[i]-a.get(a.size()-1)==1)
            {
                a.add(nums[i]);
                e=rec(i+1,nums,a,c+1,dp);
                a.remove(a.size()-1);
            }
        }
        f=rec(i+1,nums,a,c,dp);
        dp[i]=Math.max(e,f);
        return dp[i];
    }
    public int longestConsecutive(int[] nums) {
        // int dp[]=new int[nums.length+1];
        // for(int i=0;i<nums.length+1;i++)
        // dp[i]=-1;
        Arrays.sort(nums);
        // return rec(0,nums,new ArrayList<Integer>(),0,dp);
        int n=nums.length;
        if(n<=1)return n;
        int m=1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: nums)
        {
            if(hm.containsKey(i-1))
            {
                int v=hm.get(i-1);
                hm.remove(i-1);
                hm.put(i,v+1);
            }
            else if(!hm.containsKey(i))
            hm.put(i,1);
        }
        for(int i: hm.keySet())
        m=Math.max(m,hm.get(i));
        return m;
    }
}