class Node
{
    Node child[]=new Node[10];
    boolean end=false;
}
class Trie
{
    Node root;
    Trie()
    {
        root=new Node();
    }
    Node getRoot(){
        return this.root;
    }
    void add(int n)
    {
        Node tmp=root;
        int l=(int)Math.log10(n)+1,p=(int)Math.pow(10,l-1);
        while(p>0)
        {
            int v=n/p;
            if(tmp.child[v]==null)
            tmp.child[v]=new Node();
            tmp=tmp.child[v];
            n%=p;
            p/=10;
        }
        tmp.end=true;
    }
}
class Solution {
    static void rec(StringBuilder s,Node root,List<Integer> ans)
    {
        if(root==null)return;
        if(root.end==true)
        ans.add(Integer.parseInt(s.toString()));
        for(int i=0;i<10;i++)
        {
            if(root.child[i]!=null){
                s.append(i);
                rec(s,root.child[i],ans);
                s.deleteCharAt(s.length()-1);
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        Trie obj=new Trie();
        for(int i=1;i<=n;i++)
        obj.add(i);
        Node root=obj.getRoot();
        rec(new StringBuilder(),root,ans);
        return ans;
    }
}