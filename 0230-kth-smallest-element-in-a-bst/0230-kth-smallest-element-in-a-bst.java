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
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st=new Stack<>();
        // st.add(root);
        int cnt=0;
        while(!st.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                st.add(root);
                root=root.left;
            }
            if(!st.isEmpty()){
                cnt+=1;
            TreeNode tmp=st.pop();
            if(cnt==k)
            return tmp.val;
            root=tmp.right;
            }
        }
        return -1;
    }
}