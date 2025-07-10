class Solution {
    public int maxFreeTime(int eventTime, int k, int[] st, int[] et) {
        ArrayList<Integer> ar=new ArrayList<>();
        int n=st.length;
        int t=et[0];
        ar.add(st[0]-0);
        for(int i=1;i<n;i++)
        {
            ar.add(st[i]-t);
            t=et[i];
        }
        ar.add(eventTime-t);
        // System.out.println(ar);
        int i=0,j=0,ans=0,s=0;
        for(i=0;i<(k+1) && i<ar.size();i++)
        s+=ar.get(i);
        ans=Math.max(ans,s);
        while(i<ar.size())
        {
            s-=ar.get(j++);
            s+=ar.get(i++);
        ans=Math.max(ans,s);
        }
        return ans;
    }
}