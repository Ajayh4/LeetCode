/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> st=new Stack<>();
        Node ans=null,t=null,tmp=head;
        while(true)
        {
            if(tmp==null){
                if(st.isEmpty())
                break;
                else
                tmp=st.pop();
            }
            Node nn=new Node(tmp.val);
            if(ans==null)
            {
                ans=nn;
                t=nn;
            }
            else
            {
                t.next=nn;
                nn.prev=t;
                t=nn;
            }
            if(tmp.child!=null)
            {
                if(tmp.next!=null)
                st.add(tmp.next);
                tmp=tmp.child;
            }
            else
            tmp=tmp.next;
        }
        return ans;
    }
}