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
    static int rec(TreeNode root,HashMap<Integer,Integer> hm)
    {
        int s=0;
        if(root==null)
        return 0;
        int lts=rec(root.left,hm);
        int rts=rec(root.right,hm);
        int stsum=root.val+lts+rts;
        hm.put(stsum,hm.getOrDefault(stsum,0)+1);
        return stsum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        rec(root,hm);
        int ma=1;
        for(int i: hm.keySet())
        {
            if(hm.get(i)>ma)
            ma=hm.get(i);
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i: hm.keySet())
        {
            if(hm.get(i)==ma)
            ar.add(i);
        }
        int ans[]=new int[ar.size()];
        int j=0;
        for(int i: hm.keySet())
        {
            if(hm.get(i)==ma)
            ans[j++]=i;
        }
        return ans;
    }
}