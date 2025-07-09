class Node
{
    Node child[];
    boolean end=false;
    Node()
    {
        child=new Node[26];
    }
}
class MagicDictionary {
    Node root;
    public MagicDictionary() {
        root=new Node();
            // System.out.println(root.child[0]);
    }
    
    public void buildDict(String[] dictionary) {
        for(String i: dictionary)
        {
            // System.out.println(i);
            Node tmp=this.root;
            for(int j=0;j<i.length();j++)
            {
                char c=i.charAt(j);
                if(tmp.child[c-'a']==null)
                tmp.child[c-'a']=new Node();
                tmp=tmp.child[c-'a'];
            }
            tmp.end=true;
        }
    }
    public boolean find(int ind,String s,Node root,int cnt)
    {
        // System.out.println(ind+" "+s);
        if(cnt>1)return false;
        if(root==null)return false;
        if(ind>=s.length())
        {
            // System.out.println(root.end+" "+cnt+" "+s);
            return root.end&&(cnt==1);
        }
        boolean ans=false;
        ans|=find(ind+1,s,root.child[s.charAt(ind)-'a'],cnt);
        for(char c='a';c<='z';c++){
            if(s.charAt(ind)!=c)
        ans|=find(ind+1,s,root.child[c-'a'],cnt+1);
        }
        return ans;
    }
    public boolean search(String searchWord) {
        return find(0,searchWord,root,0);
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */