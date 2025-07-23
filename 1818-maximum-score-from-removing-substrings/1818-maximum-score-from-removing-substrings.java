class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st=new Stack<>();
        int n=s.length(),ans=0;
        if(x>=y)
        {
            for(int i=0;i<n;i++)
            {
                char c=s.charAt(i);
                if(st.isEmpty())
                st.add(c);
                else
                {
                    if(c=='b' && st.peek()=='a')
                    {
                        ans+=x;
                        st.pop();
                    }
                    else
                    st.add(c);
                }
            }
            Stack<Character> tmp=new Stack<>();
            while(!st.isEmpty())
            {
                char c=st.pop();
                if(tmp.isEmpty())
                tmp.add(c);
                else
                {
                    if(c=='b' && tmp.peek()=='a')
                    {
                        ans+=y;
                        tmp.pop();
                    }
                    else
                    tmp.add(c);
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                char c=s.charAt(i);
                if(st.isEmpty())
                st.add(c);
                else
                {
                    if(c=='a' && st.peek()=='b')
                    {
                        // System.out.println(st);
                        ans+=y;
                        st.pop();
                    }
                    else
                    st.add(c);
                }
            }
            Stack<Character> tmp=new Stack<>();
            while(!st.isEmpty())
            {
                char c=st.pop();
                if(tmp.isEmpty())
                tmp.add(c);
                else
                {
                    if(c=='a' && tmp.peek()=='b')
                    {
                        ans+=x;
                        tmp.pop();
                    }
                    else
                    tmp.add(c);
                }
            }
        }
        return ans;
    }
}