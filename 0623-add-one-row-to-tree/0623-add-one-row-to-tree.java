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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int lev=1;
        Queue<TreeNode> q=new LinkedList<>();
        if(depth==1)
        {
            TreeNode nroot=new TreeNode(val);
            nroot.left=root;
            return nroot;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            // TreeNode tmp=q.poll();
            lev+=1;
            int s=q.size();
            if(depth==lev)
            {
                for(int i=0;i<s;i++)
                {
                    TreeNode t=q.poll();
                    System.out.println(t.val);
                    TreeNode tl=t.left;
                    TreeNode tln=new TreeNode(val);
                    t.left=tln;
                    tln.left=tl;
                    TreeNode tr=t.right;
                    TreeNode trn=new TreeNode(val);
                    t.right=trn;
                    trn.right=tr;
                }
                break;
            }
            for(int i=0;i<s;i++)
            {
                TreeNode tmp=q.poll();
                if(tmp.left!=null)
                q.add(tmp.left);
                if(tmp.right!=null)
                q.add(tmp.right);
            }
            // depth-=1;
        }
        return root;
    }
}