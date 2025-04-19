class Solution {
    static String rec(String s,int a,int n)
    {
        if(a==n)
        return s;
        else{
        int cnt=1;
        String res="";
        int i;
        for(i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            cnt+=1;
            else
            {
                res+=cnt;
                res+=s.charAt(i);
                cnt=1;
            }
        }
        res+=cnt;
        if(i<s.length())
        res+=s.charAt(i);
        return rec(res,a+1,n);
        }
    }
    public String countAndSay(int n) {
        return rec("1",1,n);
    }
}