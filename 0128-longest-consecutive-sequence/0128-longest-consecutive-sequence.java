class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i: nums)
        hs.add(i);
        int ans=0;
        for(int i: hs)
        {
            if(!hs.contains(i-1))
            {
                int cnt=0,t=i;
                while(hs.contains(t))
                {
                    t+=1;
                    cnt+=1;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}