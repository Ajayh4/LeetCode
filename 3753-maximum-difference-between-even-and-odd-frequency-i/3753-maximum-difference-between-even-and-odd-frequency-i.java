class Solution {
    public int maxDifference(String s) {
        int f[]=new int[26],n=s.length();
        for(int i=0;i<n;i++)
        f[s.charAt(i)-'a']+=1;
        int mef=s.length(),mof=0;
        for(int i: f)
        {
            if((i&1)==1)
            mof=Math.max(mof,i);
            else if(i>0)
            mef=Math.min(mef,i);
        }
        return mof-mef;
    }
}