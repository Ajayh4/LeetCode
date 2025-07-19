class Solution {
    class Node
    {
        String p;
        ArrayList<Node>  child=new ArrayList<>();
        boolean end=false;
        Node(){}
        Node(String p)
        {
            this.p=p;
        }
    }
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(a,b) -> a.length()-b.length());
        int n=folder.length;
        Node root=new Node();
        List<String> ans=new ArrayList<>();
        for(String i: folder)
        {
            Node tmp=root;
            boolean flag=false;
            String bd[]=i.split("/");
            System.out.println(Arrays.toString(bd));
            for(int j=1;j<bd.length;j++)
            {
                String ts=bd[j];
                // System.out.println(ts);
                int f=1;
                for(Node k: tmp.child)
                {
                    if(k.p.equals(bd[j]))
                    {
                        f=0;
                        if(k.end){
                        flag=true;
                        }
                        tmp=k;
                        break;
                    }
                }
                // System.out.println(flag);
                if(f==1)
                {
                    Node nn=new Node(ts);
                    tmp.child.add(nn);
                    tmp=nn;
                }
                if(flag)break;
            }
            if(flag==false){
            ans.add(i);
            tmp.end=true;
            }
        }
        return ans;
    }
}