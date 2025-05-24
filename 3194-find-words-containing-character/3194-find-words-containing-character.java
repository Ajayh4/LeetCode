class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        int j=0;
        for(String i: words)
        {
            int f=1;
            for(char c: i.toCharArray())
            {
                if(c==x)
                {
                    f=0;
                    break;
                }
            }
            if(f==0)
            ans.add(j);
            j+=1;
        }
        return ans;
    }
}