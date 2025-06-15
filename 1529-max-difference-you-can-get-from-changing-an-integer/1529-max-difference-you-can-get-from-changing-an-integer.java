class Solution {
    public int maxDiff(int num) {
        String s=Integer.toString(num);
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='9')
            {
                ch=s.charAt(i);
                break;
            }
        }
        String a=s.replace(ch,'9');
        String b="";
        if(s.charAt(0)=='1')
        {
            int cnt=s.length() - s.replace("1", "").length();
            // System.out.println(cnt);
            if(cnt==s.length())
            b=s;
            else
            {
                char c='1';
                int i=0;
                while(i<s.length())
                {
                    if(s.charAt(i)>c)
                    {
                        c=s.charAt(i);
                        break;
                    }
                    i+=1;
                }
                // System.out.println(c);
                if(c=='1')
                b=s;
                else
                b=s.replace(c,'0');
                // System.out.println(b);
            }
        }
        else
        {
            b=s.replace(s.charAt(0),'1');
        }
        return Integer.parseInt(a)-Integer.parseInt(b);
    }
        
}