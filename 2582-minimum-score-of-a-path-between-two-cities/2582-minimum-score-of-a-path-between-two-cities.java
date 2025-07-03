class Pair
{
    int n,d;
    Pair(int a,int b)
    {
        n=a;
        d=b;
    }
}
class Solution {
    static void rec(int n,int v[],ArrayList<ArrayList<Pair>> adj)
    {
        v[n]=1;
        for(Pair i: adj.get(n))
        {
            if(v[i.n]==0){
                rec(i.n,v,adj);
            }
            // else if(!hm.get(i.n).contains(n)){
            //     f=0;
            //     hm.get(i.n).add(n);
            //     ans=Math.min(ans,rec(i.n,v,adj,Math.min(m,i.d),hm));
            // }
        }
    }
    public int minScore(int n, int[][] roads) {
        int v[]=new int[n+1];
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        adj.add(new ArrayList<>());
        for(int i[]: roads)
        {
            adj.get(i[0]).add(new Pair(i[1],i[2]));
            adj.get(i[1]).add(new Pair(i[0],i[2]));
        }
        rec(1,v,adj);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(v[i]==1){
                for(Pair j: adj.get(i))
                ans=Math.min(ans,j.d);
            }
        }
        return ans;
    }
}