class Solution {
    public int minimumRefill(int[] plants, int cA, int cB) {
        int ans=0;
        int rA=cA,rB=cB;
        int i=0,j=plants.length-1;
        while(i<=j)
        {
            // System.out.println(cA+" "+cB);
            if(i==j)
            {
                int ma=Math.max(cA,cB);
                if(ma>=plants[i])
                i+=1;
                else
                {
                    ans+=1;
                    i+=1;
                }
            }
            else
            {
                if(plants[i]<=cA)
                {
                    cA-=plants[i];
                    i+=1;
                }
                else
                {
                    cA=rA;
                    ans+=1;
                    cA-=plants[i];
                    i+=1;
                }
                if(plants[j]<=cB)
                {
                    cB-=plants[j];
                    j-=1;
                }
                else
                {
                    cB=rB;
                    ans+=1;
                    cB-=plants[j];
                    j-=1;
                }
            }
            // System.out.println(cA+" "+cB+" "+ans);
        }
        return ans;
    }
}