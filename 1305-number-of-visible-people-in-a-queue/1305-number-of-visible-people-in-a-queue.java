class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                st.add(heights[i]);
                ans[i]=0;
            }
            else if(st.peek()>heights[i])
            {
                st.add(heights[i]);
                ans[i]=1;
            }
            else
            {
                int cnt=0;
                while(!st.isEmpty() && st.peek()<heights[i])
                {
                    st.pop();
                    cnt+=1;
                }
                if(st.isEmpty())
                ans[i]=cnt;
                else
                ans[i]=cnt+1;
                st.add(heights[i]);
            }
        }
        return ans;
    }
}