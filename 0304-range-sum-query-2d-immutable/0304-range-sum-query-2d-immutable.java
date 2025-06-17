class NumMatrix {
    int mat[][];
    static int n,m;
    public NumMatrix(int[][] matrix) {
        n=matrix.length;m=matrix[0].length;
        mat=new int[n][m];
        // pre=new int[n][m];
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=0;j<m;j++){
                mat[i][j]=matrix[i][j];
            s+=mat[i][j];
            mat[i][j]=s;
            }
        }
        // for(int i[]: mat)
        // System.out.println(Arrays.toString(i));
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=0;
        // col1=Math.max(col1,col2);
        if(row1==row2 && col1==col2){
            if(col1==0)return mat[row1][col1];
            return mat[row1][col1]-mat[row1][col1-1];
        }
        if(col1==col2)
        {
            if(col1==0)
            {
                for(int i=row1;i<=row2;i++)
                ans+=mat[i][col1];
            }
            else
            {
                for(int i=row1;i<=row2;i++)
                ans+=(mat[i][col1]-mat[i][col1-1]);
            }
            return ans;
        }
        for(int i=row1;i<=row2;i++)
        {
            if(col1==0)
            ans+=mat[i][col2];
            else if(col1==(m-1))
            ans+=mat[i][m-1];
            else
            ans+=(mat[i][col2]-mat[i][col1-1]);
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */