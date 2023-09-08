class Solution {
    public void rotate(int[][] matrix) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            hm.put((i+" "+j+""),matrix[j][i]);
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            matrix[i][j]=hm.get(i+" "+j+"");
            int j=0,k=matrix[i].length-1;
            while(j<k)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=t;
                j+=1;
                k-=1;
            }
        }
    }
}