class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        // char arr=s.toCharArray();
        int n=s.length(),i=0,j=n-1;
        while(i<n)
        {
            while(i<n && s.charAt(i)=='0')
            i+=1;
            while(j>i && s.charAt(j)=='1')
            j-=1;
            if(i<j)
            ans+=(j-i);
            i+=1;
            j-=1;
        }
        return ans;
    }
}