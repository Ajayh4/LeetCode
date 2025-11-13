class Solution {
    static boolean fun(String a,String b)
    {
        int n1=a.length(),n2=b.length();
        if(n1-n2!=1)return false;
        int i=0,j=0,cnt=0;
        while(i<n1 && j<n2)
        {
            if(a.charAt(i)==b.charAt(j))
            {
                i+=1;
                j+=1;
            }
            else
            {
                cnt+=1;
                i+=1;
            }
            if(cnt>1)
            return false;
        }
        if(cnt==0 && i<n1)return true;
        if(cnt==1 && (i==n1 && j==n2))return true;
        return false;
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b) -> {
            if(a.length()!=b.length())
            return a.length()-b.length();
            return 0;
        });
        int n=words.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(fun(words[i],words[j]) && dp[i]<1+dp[j])
                {
                    dp[i]=1+dp[j];
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        ans=Math.max(ans,1+dp[i]);
        return ans;
    }
}