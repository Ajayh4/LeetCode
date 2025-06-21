class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int tmp[]=new int[n];
        StringBuilder sb=new StringBuilder();
        for(int i[]: shifts)
        {
            if(i[2]==0)
            {
                if(i[1]==(n-1))
                tmp[i[0]]-=1;
                else
                {
                    tmp[i[0]]-=1;
                    tmp[i[1]+1]+=1;
                }
            }
            else
            {
                if(i[1]==(n-1))
                tmp[i[0]]+=1;
                else
                {
                    tmp[i[0]]+=1;
                    tmp[i[1]+1]-=1;
                }
            }
        }
        int sum=0;;
        for(int i=0;i<n;i++)
        {
            sum+=tmp[i];
            tmp[i]=sum;
        }
        // System.out.println(Arrays.toString(tmp));
        for(int i=0;i<n;i++)
        {
            tmp[i]+=(s.charAt(i)-'a');
            if(tmp[i]<0)
            {
                while(tmp[i]<0)
                tmp[i]+=26;
            }
            else if(tmp[i]>25)
            tmp[i]%=26;
            sb.append((char)(tmp[i]+97));
        }
        return sb.toString();
    }
}