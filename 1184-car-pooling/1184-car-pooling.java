class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int cap[]=new int[1001];
        for(int i[]: trips)
        {
            cap[i[1]]+=i[0];
            cap[i[2]]-=i[0];
        }
        int s=0;
        for(int i=0;i<1000;i++)
        {
            s+=cap[i];
            if(s>capacity)return false;
        }
        return true;
    }
}