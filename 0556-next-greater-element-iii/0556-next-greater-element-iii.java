class Solution {
    public int nextGreaterElement(int n) {
        char ar[]=Integer.toString(n).toCharArray();
        int s=ar.length;
        int f=1;
        for(int i=s-2;i>=0;i--)
        {
            int ti=-1;
            for(int j=s-1;j>i;j--)
            {
                if(ar[i]<ar[j])
                {
                    f=0;
                    ti=i;
                    char c=ar[i];
                    ar[i]=ar[j];
                    ar[j]=c;
                    break;
                }
            }
            // System.out.println(ti);
            if(f==0){
                Arrays.sort(ar,ti+1,s);
                break;
            }
        }
        // System.out.println(Arrays.toString(ar));
        if(f==1)return -1;
        StringBuilder res=new StringBuilder();
        for(char c: ar)
        res.append(c);
        long val=Long.parseLong(res.toString());
        if(val<=Integer.MAX_VALUE)
        return (int)val;
        return -1;
    }
}