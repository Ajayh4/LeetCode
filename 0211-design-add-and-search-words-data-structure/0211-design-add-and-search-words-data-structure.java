class Node
{
    Node child[];
    boolean end;
    Node()
    {
        child=new Node[27];
        end=false;
    }
}
class WordDictionary {
    Node root=null;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
        Node tmp=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(tmp.child[c-'a']==null)
            tmp.child[c-'a']=new Node();
            tmp=tmp.child[c-'a'];
        }
        tmp.end=true;
    }
    
    boolean rec(int ind,StringBuilder res,String word,Node tmp)
    {
        if(ind>=word.length())
        return this.search(res.toString());
        boolean ans=false;
        if(word.charAt(ind)=='.')
        {
            for(char c='a';c<='z';c++){
                if(tmp!=null && tmp.child[c-'a']!=null){
                res.append(c);
            ans|=rec(ind+1,res,word,tmp.child[c-'a']);
            res.deleteCharAt(ind);
                }
            }
        }
        else{
            if(tmp!=null && tmp.child[word.charAt(ind)-'a']!=null){
                res.append(word.charAt(ind));
                ans|=rec(ind+1,res,word,tmp.child[word.charAt(ind)-'a']);
                res.deleteCharAt(ind);
            }
        }
        return ans;
    }
    public boolean search(String word) {
        Node tmp=root;
        if(word.contains("."))
        return this.rec(0,new StringBuilder(),word,root);
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(tmp.child[c-'a']==null)
            return false;
            tmp=tmp.child[c-'a'];
        }
        return tmp.end;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */