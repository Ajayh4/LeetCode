class BrowserHistory {
    static class Node
    {
        String val;
        Node left,right;
        public Node(String val)
        {
            this.val=val;
            left=null;
            right=null;
        }
    }
    static void printll(Node root)
    {
        while(root!=null)
        {
            System.out.print(root.val+" ");
            root=root.right;
        }
        System.out.println();
    }
    Node root,tail;
    public BrowserHistory(String homepage) {
        Node nn=new Node(homepage);
        root=nn;
        tail=nn;
    }
    
    public void visit(String url) {
        Node nn=new Node(url);
        tail.right=nn;
        nn.left=tail;
        tail=tail.right;
        // printll(root);
    }
    
    public String back(int steps) {
        for(int i=0;i<steps && tail.left!=null;i++)
        {
            tail=tail.left;
        }
        // printll(tail);
        return tail.val;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps && tail.right!=null;i++)
        {
            tail=tail.right;
        }
        return tail.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */