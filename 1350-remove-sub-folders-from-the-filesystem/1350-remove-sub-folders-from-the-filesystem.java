class Solution {
    static class Node
    {
        Node child[]=new Node[27];
        boolean end=false;
    }
    static int getChar(char ch)
    {
        if(ch=='/')
        return 26;
        return ch-'a';
    }
    static boolean insert(String s,Node root)
    {
        Node tmp=root;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if (tmp.end && s.charAt(i) == '/') return false;
            int ch=getChar(s.charAt(i));
            if(tmp.child[ch]==null)
            tmp.child[ch]=new Node();
            tmp=tmp.child[ch];
        }
        tmp.end=true;
        return true;
    }
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(a,b) -> a.length()-b.length());
        int n=folder.length;
        Node root=new Node();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(insert(folder[i],root))
            {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}