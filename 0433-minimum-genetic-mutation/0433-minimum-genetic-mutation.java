class Pair
{
    String s;
    int c;
    Pair(String s,int c)
    {
        this.s=s;
        this.c=c;
    }
}
class Solution {
    public int minMutation(String s, String e, String[] bank) {
        HashSet<String> hs=new HashSet<>();
        for(String i: bank)
        hs.add(i);
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(s,0));
        char rep[]={'A','C','G','T'};
        while(!q.isEmpty())
        {
            Pair t=q.poll();
            if(t.s.equals(e))
            return t.c;
            hs.remove(t.s);
            int n=t.s.length();
            for(int i=0;i<n;i++)
            {
                char c=t.s.charAt(i);
                for(char tc: rep)
                {
                    if(tc!=c)
                    {
                        String ns=t.s.substring(0,i)+tc+t.s.substring(i+1);
                        // System.out.println(ns);
                        if(hs.contains(ns))
                        {
                            q.add(new Pair(ns,t.c+1));
                        }
                    }
                }
            }
        }
        return -1;
    }
}