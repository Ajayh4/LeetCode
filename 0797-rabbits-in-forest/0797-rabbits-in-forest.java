class Solution {
    public int numRabbits(int[] answers) {
        int f[]=new int[1001];
        for(int i: answers)
        f[i]+=1;
        // System.out.println(Arrays.toString(f));
        int ans=0,cnt=0;
        for(int i=1;i<1000;i++)
        {
            if(f[i]==(i+1))continue;
            // if(f[i]>=(i+1))
            // ans+=Math.abs(f[i]-(i+1))%(i+1)*(i);
            // else
            if(f[i]%(i+1)==0)
            cnt+=f[i]/(i+1);
            if(f[i]!=0)
            ans+=(i+1)-(f[i]%(i+1));
            // System.out.println(ans);
        }
        // ans+=f[0];
        return ans+answers.length-cnt;
    }
}