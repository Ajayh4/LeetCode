class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        ArrayList<Integer> ar;
        for(int i=1;i<n;i++)
        {
            int t=0,j=i;
            ar=new ArrayList<>();
            while(t<n && j<n){
            ar.add(grid[t][j]);
            t+=1;
            j+=1;
            }
            Collections.sort(ar);
            // System.out.println(ar);
            t=0;
            j=i;
            while(t<n && j<n)
            {
                grid[t][j]=ar.get(t);
                t+=1;
                j+=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            int t=i,j=0;
            ar=new ArrayList<>();
            while(t<n && j<n){
            ar.add(grid[t][j]);
            t+=1;
            j+=1;
            }
            Collections.sort(ar, (a,b) -> b-a);
            // System.out.println(ar);
            t=i;
            j=0;
            while(t<n && j<n)
            {
                grid[t][j]=ar.get(j);
                t+=1;
                j+=1;
            }
        }
        return grid;
    }
}