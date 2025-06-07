class DisjointSet
{
    int rank[]=new int[26];
    int parent[]=new int[26];
    DisjointSet(){
        for(int i=0;i<26;i++)
        parent[i]=i;
    }
    void union(int a,int b)
    {
        if(findparent(a)==findparent(b))return;
        int pa=findparent(a);
        int pb=findparent(b);
        if(rank[pa]==rank[pb])
        {
            rank[pa]+=1;
            parent[pb]=pa;
        }
        else if(rank[pa]>rank[pb])
        {
            parent[pb]=pa;
        }
        else
        parent[pa]=pb;
    }

    int findparent(int n)
    {
        if(parent[n]==n)
        return n;
        else 
        return parent[n]=findparent(parent[n]);
    }
}
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        DisjointSet dj=new DisjointSet();
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            dj.union(s1.charAt(i)-'a',s2.charAt(i)-'a');
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<baseStr.length();i++)
        {
            char c=(char)(97+dj.findparent(baseStr.charAt(i)-'a'));
            int f=1;
            char sc=c;
            for(int j=0;j<26;j++)
            {
                if(dj.parent[j]==(c-'a'))
                {
                    if((char)(j+97)<sc)
                    sc=(char)(j+97);
                }
            }
            ans.append(sc);
        }
        return ans.toString();
    }
}