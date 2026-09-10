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
    static class Pair
    {
        int cnt,sum;
        Pair(int cnt,int sum)
        {
            this.cnt=cnt;
            this.sum=sum;
        }
    }
    static int ans=0;
    static Pair rec(TreeNode root)
    {
        if(root==null)
        return new Pair(0,0);
        Pair ls=rec(root.left),rs=rec(root.right);
        int tcnt=ls.cnt+rs.cnt+1,tsum=root.val+ls.sum+rs.sum;
        if((tsum/tcnt)==root.val)
        ans+=1;
        return new Pair(tcnt,tsum);
    }
    public int averageOfSubtree(TreeNode root) {
        ans=0;
        rec(root);
        return ans;
    }
}