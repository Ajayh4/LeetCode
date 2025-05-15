class Pair
{
    int v,m;
    Pair(int a,int b)
    {
        v=a;
        m=b;
    }
}
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        st.push(new Pair(val,val));
        else
        st.push(new Pair(val,Math.min(st.peek().m,val)));
    }
    
    public void pop() {
        if(!st.isEmpty())
        st.pop();
    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peek().v;
        return -1;
    }
    
    public int getMin() {
        if(!st.isEmpty())
        return st.peek().m;
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */