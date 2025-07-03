class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int ans[]=new int[n];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int i=0;i<n-1;i++){
            adj.get(i).add(i+1);
            adj.get(i+1).add(i);
        }
        if(x!=y){
            if(!adj.get(x-1).contains(y-1))
        adj.get(x-1).add(y-1);
        if(!adj.get(y-1).contains(x-1))
        adj.get(y-1).add(x-1);
        }
        // System.out.println(adj);
        for(int i=0;i<n;i++)
        {
            int v[]=new int[n];
            Queue<Integer> q=new LinkedList<>();
            int cnt=0;
            for(int j: adj.get(i)){
            q.add(j);
            v[j]=1;
            }
            v[i]=1;
            while(!q.isEmpty())
            {
                int s=q.size();
                // System.out.println(q);
                ans[cnt]+=s;
                for(int j=0;j<s;j++)
                {
                    int t=q.poll();
                    for(int k: adj.get(t)){
                        if(v[k]==0){
                            v[k]=1;
                            q.add(k);
                        }
                    }
                }
                cnt+=1;
            }
        }
        return ans;
    }
}