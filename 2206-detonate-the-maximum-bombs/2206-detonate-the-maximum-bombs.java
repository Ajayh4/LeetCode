class Solution {
    // static double dist(int x1,int y1,int x2,int y2)
    // {
    //     double val=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    //     // System.out.println(val);
    //     return val;
    // }
    public int maximumDetonation(int[][] bombs) {
        int n=bombs.length,ans=1;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<n;i++)
        {
            int b1x=bombs[i][0],b1y=bombs[i][1],r=bombs[i][2];
            for(int j=0;j<n;j++)
            {
                if (i != j) {
                    int b2x = bombs[j][0], b2y = bombs[j][1];
                    long dx = (long)b2x - b1x;
                    long dy = (long)b2y - b1y;
                    long distSq = dx * dx + dy * dy;
                    long rSq = (long)r * r;
                    if (distSq <= rSq) {
                        adj.get(i).add(j);
                    }
                }
            }
        }
        // Collections.sort(adj,(a,b) -> b.size()-a.size());
        // System.out.println(adj);
        for(int i=0;i<n;i++)
        {
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            int v[]=new int[n];
            v[i]=1;
            int cnt=0;
            while(!q.isEmpty())
            {
                int t=q.poll();
                // System.out.println(t);
                cnt+=1;
                for(int j: adj.get(t))
                {
                    if(v[j]==0){
                    q.add(j);
                    v[j]=1;
                    }
                }
            }
            // System.out.println();
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}