class Solution {
    static int[] getCoordinates(int ind,int r,int c)
    {
        // ind+=1;
        int col=ind%c;
        if(col<0)
        col+=c;
        return new int[]{ind/c,col};
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int l=0,h=r*c-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            int cord[]=getCoordinates(m,r,c);
            // System.out.println(m+" "+cord[0]+" "+cord[1]);
            int val=matrix[cord[0]][cord[1]];
            if(val==target)
            return true;
            else if(val>target)
            h=m-1;
            else
            l=m+1;
        }
        return false;
    }
}