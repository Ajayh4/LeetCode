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
        int cnt,sum,ans;
        Pair(int cnt,int sum,int ans)
        {
            this.cnt=cnt;
            this.sum=sum;
            this.ans=ans;
        }
    }
    static int ans=0;
    static Pair rec(TreeNode root)
    {
        if(root==null)
        return new Pair(0,0,0);
        Pair ls=rec(root.left),rs=rec(root.right);
        int tcnt=ls.cnt+rs.cnt+1,tsum=root.val+ls.sum+rs.sum;
        boolean flag=false;
        if((tsum/tcnt)==root.val)
        flag=true;
        return new Pair(tcnt,tsum,(flag)?(ls.ans+rs.ans+1):(ls.ans+rs.ans));
    }
    public int averageOfSubtree(TreeNode root) {
        return rec(root).ans;
    }
}