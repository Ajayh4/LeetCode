class Solution {
    static class DisjointSet
    {
        int parent[];
        int size[];
        public DisjointSet(int n)
        {
            parent=new int[n+1];
            size=new int[n+1];
            for(int i=0;i<n;i++)
            {
                parent[i]=i;
                size[i]=0;
            }
        }

        int findParent(int n)
        {
            if(n==parent[n])
            return n;
            return parent[n]=findParent(parent[n]);
        }

        boolean unionBySize(int u,int v)
        {
            int pu=findParent(u);
            int pv=findParent(v);
            if(pu==pv)
            return false;

            if(size[pu]==size[pv])
            {
                size[pu]+=1;
                parent[pv]=parent[pu];
            }
            else if(size[pu]>size[pv])
            parent[pv]=parent[pu];
            else
            parent[pu]=pv;
            return true;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        DisjointSet dj=new DisjointSet(n);
        int ans[]=new int[2];
        for(int i[]: edges)
        {
            if(!dj.unionBySize(i[0],i[1]))
            {
                ans[0]=i[0];
                ans[1]=i[1];
                break;
            }
        }
        return ans;
    }
}