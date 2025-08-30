class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows[][]=new boolean[9][9];
        boolean cols[][]=new boolean[9][9];
        boolean boxes[][]=new boolean[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    int v=board[i][j]-'1';
                    int bi=(i/3)*3+(j/3);
                    if(rows[i][v] || cols[v][j] || boxes[bi][v])
                    return false;
                    rows[i][v]=cols[v][j]=boxes[bi][v]=true;
                }
            }
        }
        return true;
    }
}