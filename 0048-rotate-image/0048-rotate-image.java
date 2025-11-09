class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int row=0;
        for(int j=1;j<c;j++)
        {
            int x1=row,y1=j,x2=j,y2=row;
            while(x1<x2)
            {
                int t=matrix[x1][y1];
                matrix[x1][y1]=matrix[x2][y2];
                matrix[x2][y2]=t;
                x1+=1;
                x2-=1;
                y1-=1;
                y2+=1;
            }
        }
        int col=c-1;
        for(int i=1;i<r;i++)
        {
            int x1=i,y1=col,x2=col,y2=i;
            while(y1>y2)
            {
                int t=matrix[x1][y1];
                matrix[x1][y1]=matrix[x2][y2];
                matrix[x2][y2]=t;
                x1+=1;
                x2-=1;
                y1-=1;
                y2+=1;
            }
        }
        // for(int i[]: matrix)
        // System.out.println(Arrays.toString(i));
        for(int i=0;i<r;i++)
        {
            int j1=0,j2=c-1;
            while(j1<j2)
            {
                int t=matrix[i][j1];
                matrix[i][j1]=matrix[i][j2];
                matrix[i][j2]=t;
                j1+=1;
                j2-=1;
            }
        }
    }
}