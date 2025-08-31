class Solution {
    static boolean check(int frq[],int tmp[])
    {
        for(int i=0;i<58;i++)
        {
            if(tmp[i]<frq[i])
            return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int frq[]=new int[58];
        for(int i=0;i<t.length();i++)
        frq[t.charAt(i)-'A']+=1;
        int tmp[]=new int[58];
        int i=0,j=0;
        String ans="";
        int ml=Integer.MAX_VALUE;
        while(j<s.length())
        {
            tmp[s.charAt(j)-'A']+=1;
            if((j-i+1)>=t.length())
            {
                if(check(frq,tmp))
                {
                    while(i<j)
                    {
                        char c=s.charAt(i);
                        if(frq[c-'A']==0)
                        i+=1;
                        else if(tmp[c-'A']-1>=frq[c-'A']){
                        i+=1;
                        tmp[c-'A']-=1;
                        }
                        else
                        break;
                    }
                    if((j-i+1)<ml)
                    {
                        ml=j-i+1;
                        ans=s.substring(i,j+1);
                    }
                }
            }
            j+=1;
            // System.out.println(i+" "+j);
        }
        return ans;
    }
}