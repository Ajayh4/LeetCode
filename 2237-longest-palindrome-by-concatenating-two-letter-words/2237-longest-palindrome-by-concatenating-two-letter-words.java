class Solution {
    public int longestPalindrome(String[] words) {
        int ans=0,tmp=0;
        HashMap<String,Integer> hm=new HashMap<>();
        for(String i: words)
        {
            String nf=""+i.charAt(1)+i.charAt(0);
            if(hm.containsKey(nf))
            {
                ans+=4;
                int v=hm.get(nf);
                if(v==1)
                hm.remove(nf);
                else
                hm.put(nf,v-1);
            }
            else
            {
                if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
                else
                hm.put(i,1);
            }
        }
        for(String i: hm.keySet())
        {
            if(i.charAt(0)==i.charAt(1))
            tmp=Math.max(tmp,hm.get(i)*2);
        }
        if(ans==0 && tmp==0)
        return 0;
        else if(ans==0)
        return tmp;
        else
        return ans+tmp;
    }
}