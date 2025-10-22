/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    Stack<TreeNode> st;
    ArrayList<Integer> ar;
    int ind;
    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        ar=new ArrayList<>();
        ind=0;
        while(!st.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                st.add(root);
                root=root.left;
            }
            TreeNode tmp=st.pop();
            if(tmp.right!=null)
            root=tmp.right;
            if(tmp!=null)
            ar.add(tmp.val);
        }
    }
    
    public int next() {
        return ar.get(ind++);
    }
    
    public boolean hasNext() {
        if(ind>=ar.size())
        return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */