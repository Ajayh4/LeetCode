class Solution {
    class Pair
    {
        int i,j,s;
        Pair(int i,int j,int s)
        {
            this.i=i;
            this.j=j;
            this.s=s;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1=nums1.length,n2=nums2.length;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.s-b.s);
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<String> hs=new HashSet<>();
        pq.add(new Pair(0,0,nums1[0]+nums2[0]));
        hs.add("0*0");
        int cnt=0;
        while(cnt<k)
        {
            Pair t=pq.poll();
            cnt+=1;
            ArrayList<Integer> ar=new ArrayList<>();
            ar.add(nums1[t.i]);
            ar.add(nums2[t.j]);
            ans.add(ar);
            if(cnt==k)return ans;
            if((t.i+1)<n1 && !hs.contains((t.i+1)+"*"+t.j)){
            pq.add(new Pair(t.i+1,t.j,nums1[t.i+1]+nums2[t.j]));
            hs.add((t.i+1)+"*"+t.j);
            }
            if((t.j+1)<n2 && !hs.contains(t.i+"*"+(t.j+1))){
            pq.add(new Pair(t.i,t.j+1,nums1[t.i]+nums2[t.j+1]));
            hs.add(t.i+"*"+(t.j+1));
            }
        }
        return ans;
    }
}