class Solution {
    public int hIndex(int[] cit) {
        for(int i=cit.length;i>=0;i--)
        {
            int cnt=0;
            for(int j: cit)
            {
                if(i<=j)
                cnt+=1;
            }
            if(cnt>=i)
            return i;
        }
        return 0;
    }
}