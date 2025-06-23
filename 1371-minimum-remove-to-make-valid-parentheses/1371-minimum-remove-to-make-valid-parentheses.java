class Pair
{
    char c;
    int ind;
    Pair(char c,int ind)
    {
        this.c=c;
        this.ind=ind;
    }
}
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb =new StringBuilder();
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                st.push(new Pair('(',i));
                sb.append('*');
            }
            else if(c==')')
            {
                if(st.isEmpty() || st.peek().c==')'){
                    sb.append('*');
                continue;
                }
                else
                {
                    Pair t=st.pop();
                    // System.out.println(sb);
                    sb.setCharAt(t.ind,t.c);
                    sb.append(c);
                }
            }
            else
            sb.append(c);
        }
        return sb.toString().replace("*","");
    }
}