class Solution {
    static boolean find(char board[][],char c,int i,int j)
    {
        int tx=0,ty=j;
        while(tx<9)
        {
            if(board[tx][ty]==c)
            return false;
            tx+=1;
        }
        tx=i;ty=0;
        while(ty<9)
        {
            if(board[tx][ty]==c)
            return false;
            ty+=1;
        }
        i=(i/3)*3;j=(j/3)*3;
        for(tx=i;tx<i+3;tx++)
        {
            for(ty=j;ty<j+3;ty++)
            {
                if(board[tx][ty]==c)
                return false;
            }
        }
        return true;
    }
    static boolean rec(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(find(board,c,i,j))
                        {
                            board[i][j]=c;
                            if(rec(board))
                            return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        rec(board);
        // for(char c[]: board)
        // System.out.println(Arrays.toString(c));
    }
}