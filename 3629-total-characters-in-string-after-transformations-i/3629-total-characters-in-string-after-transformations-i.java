class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int f[]=new int[26];
        int mod=1000000007;
        for(int i=0;i<s.length();i++)
        f[s.charAt(i)-'a']+=1;
        while(t>=26)
        {
            int tmp[]=new int[26];
            for(int i=0;i<25;i++)
            { 
                tmp[i]=(f[i]+tmp[i])%mod;
                tmp[i+1]=(f[i]+tmp[i+1])%mod;
            }
            tmp[0]=(f[25]+tmp[0])%mod;
            tmp[1]=(f[25]+tmp[1])%mod;
            tmp[25]=(f[25]+tmp[25])%mod;
            t-=26;
            for(int i=0;i<26;i++)
            f[i]=tmp[i];
        }
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(f[i]>0)
            {
                if((i+t)>=26)
                ans=(f[i]+ans)%mod;
            }
        }
        for(int i: f)
        ans=(ans+i)%mod;
        return ans;
    }
}