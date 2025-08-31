class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length;
        Arrays.sort(nums4);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int s=nums1[i]+nums2[j];
                hm.put(s,hm.getOrDefault(s,0)+1);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans+=hm.getOrDefault(-(nums3[i]+nums4[j]),0);
            }
        }
        return ans;
    }
}