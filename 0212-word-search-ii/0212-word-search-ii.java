class Solution {
    static class Node
    {
        Node child[];
        boolean end;
        String sf;
        Node()
        {
            child=new Node[26];
            end=false;
            sf="";
        }
    }
    static HashSet<String> ans;
    static void rec(int x,int y,Node root,char[][] board,int v[][],int r,int c)
    {
        v[x][y]=1;
        // System.out.println(x+" "+y);
        if(root.end)
        ans.add(root.sf);
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        for(int k=0;k<4;k++)
        {
            int nx=dx[k]+x,ny=dy[k]+y;
            if(nx>=0 && nx<r && ny>=0 && ny<c && v[nx][ny]==0 && root.child[board[nx][ny]-'a']!=null)
            {
                rec(nx,ny,root.child[board[nx][ny]-'a'],board,v,r,c);
            }
        }
        v[x][y]=0;
    }
    public List<String> findWords(char[][] board, String[] words) {
        ans=new HashSet<>();
        Node root=new Node();
        for(String i: words)
        {
            Node tmp=root;
            String r="";
            int n=i.length();
            for(int j=0;j<n;j++)
            {
                char c=i.charAt(j);
                if(tmp.child[c-'a']==null)
                tmp.child[c-'a']=new Node();
                tmp=tmp.child[c-'a'];
                r+=c;
                tmp.sf=r;
            }
            tmp.end=true;
        }
        int r=board.length,c=board[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(root.child[board[i][j]-'a']!=null){
                    int v[][]=new int[r][c];
                    rec(i,j,root.child[board[i][j]-'a'],board,v,r,c);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}