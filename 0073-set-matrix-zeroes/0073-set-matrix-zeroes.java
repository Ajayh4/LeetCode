class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow=false,firstColumn=false;
        int r=matrix.length,c=matrix[0].length;

        // check if the first row contains any zero. if so make the marker as true
        for(int i=0;i<c;i++)
        {
            if(matrix[0][i]==0)
            {
                firstRow=true;
                break;
            }
        }

        // check if the first column contains any zero. if so make the marker as true
        for(int i=0;i<r;i++)
        {
            if(matrix[i][0]==0)
            {
                firstColumn=true;
                break;
            }
        }

        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                matrix[i][j]=0;
            }
        }

        //firstRow transformation
        if(firstRow)
        {
            for(int i=0;i<c;i++)
            matrix[0][i]=0;
        }

        if(firstColumn)
        {
            for(int i=0;i<r;i++)
            matrix[i][0]=0;
        }
    }
}