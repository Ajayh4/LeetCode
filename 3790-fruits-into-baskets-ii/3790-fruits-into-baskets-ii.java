class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int f[]=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int fg=1;
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j] && f[j]==0)
                {
                    f[j]=1;
                    fg=0;
                    break;
                }
            }
            if(fg==1)cnt+=1;
        }
        return cnt;
    }
}