class Solution {
    public long flowerGame(int n, int m) {
        long ans=0;
        long o1=n/2,e1=n/2,o2=m/2,e2=m/2;
        if(n%2==1)
        o1+=1;
        if(m%2==1)
        o2+=1;
        ans+=(o1*e2);
        ans+=(e1*o2);
        return ans;
    }
}