class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int cnt=n-k;
        int ts=0,s=0,ans=0;
        for(int i=0;i<cnt;i++)
        s+=cardPoints[i];
        ans=s;
        ts+=s;
        int j=0;
        for(int i=cnt;i<n;i++)
        {
            ts+=cardPoints[i];
            s+=cardPoints[i];
            s-=cardPoints[j++];
            ans=Math.min(ans,s);
        }
        return ts-ans;
    }
}