class Solution {
    public String answerString(String w, int nf) {
        int ms=w.length()-nf+1;
        System.out.println(ms);
        int n=w.length();
        if(nf==1)return w;
        String ans="";
        char mc='a';
        for(int i=0;i<n;i++)
        {
            if(w.charAt(i)>mc)
            mc=w.charAt(i);
        }
        for(int i=0;i<n;i++)
        {
            if(w.charAt(i)==mc)
            {
                int j=i+1,k=1;
                StringBuilder tmp=new StringBuilder();
                tmp.append(w.charAt(i));
                while(j<n && k<ms)
                {
                    tmp.append(w.charAt(j));
                    j+=1;
                    k+=1;
                }
                if(ans.compareTo(tmp.toString())<0)
                ans=tmp.toString();
            }
        }
        return ans;
    }
}