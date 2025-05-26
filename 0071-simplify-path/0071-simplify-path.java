class Solution {
    public String simplifyPath(String s) {
        int n=s.length();
        Stack<String> st=new Stack<>();
        for(int i=1;i<n;i++)
        {
            int j=i;
            StringBuilder r=new StringBuilder();
            while(j<n && s.charAt(j)!='/')
            {
                r.append(s.charAt(j));
                j+=1;
            }
            if(r.toString().equals("."))
            {
                i=j;
                // continue;
            }
            else if(r.toString().equals(".."))
            {
                if(!st.isEmpty())
                st.pop();
                i=j;
            }
            else
            {
                if(r.length()!=0)
                st.push(r.toString());
                i=j;
            }
        }
        StringBuilder r=new StringBuilder();
        if(st.isEmpty())return "/";
        while(!st.isEmpty())
        {
            r.insert(0,"/"+st.pop());
        }
        return r.toString();
    }
}