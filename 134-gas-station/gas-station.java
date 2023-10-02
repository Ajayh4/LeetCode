class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        d[i]=gas[i]-cost[i];
        if(n==1)
        {
            if(gas[0]>=cost[0])
            return 0;
            return -1;
        }
        for(int i=0;i<n;i++)
        {
            if(d[i]>0)
            {
                int f=1;
                int s=0;
                for(int j=i;j<n;j++)
                {
                    s+=d[j];
                    if(s<0)
                    {
                        f=0;
                        break;
                    }
                }
                for(int j=0;j<i;j++)
                {
                    s+=d[j];
                    if(s<0)
                    {
                        f=0;
                        break;
                    }
                }
                if(f==1)
                return i;
            }
        }
        return -1;
    }
}