/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String tmp="";
        if(root==null)return tmp;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode t=q.poll();
            if(t==null)
            tmp+="N#";
            else
            {
                tmp+=(t.val+"#");
                q.add(t.left);
                q.add(t.right);
            }
        }
        System.out.println(tmp);
        return tmp;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode ans=null;
        if(data.length()==0)
        return ans;
        Queue<TreeNode> q=new LinkedList<>();
        String ar[]=data.split("#");
        // System.out.println(Arrays.toString(ar)+" "+ar.length);
        ans=new TreeNode(Integer.parseInt(ar[0]));
        q.add(ans);
        for(int i=1;i<ar.length;i++)
        {
            TreeNode t=q.poll();
            if(!ar[i].equals("N"))
            {
                TreeNode lft=new TreeNode(Integer.parseInt(ar[i]));
                t.left=lft;
                q.add(lft);
            }
            if((i+1)<ar.length && !ar[++i].equals("N"))
            {
                TreeNode rgt=new TreeNode(Integer.parseInt(ar[i]));
                t.right=rgt;
                q.add(rgt);
            }
        }
        return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;