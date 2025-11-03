class Solution {
    static class Pair
    {
        int ind;
        char c;
        Pair(int ind,char c)
        {
            this.ind=ind;
            this.c=c;
        }
    }
    public int minCost(String colors, int[] neededTime) {
        int ans=0;
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<colors.length();i++)
        {
            char c=colors.charAt(i);
            Pair tmp=new Pair(i,c);
            if(st.isEmpty())
            st.add(tmp);
            else
            {
                if(st.peek().c==c)
                {
                    if(neededTime[st.peek().ind]>neededTime[i])
                    {
                        ans+=neededTime[i];
                    }
                    else
                    {
                        ans+=neededTime[st.peek().ind];
                        st.pop();
                        st.add(tmp);
                    }
                }
                else
                st.add(tmp);
            }
        }
        return ans;
    }
}