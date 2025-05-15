class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans1=new ArrayList<>();
        List<String> ans2=new ArrayList<>();
        int i=0,n=words.length;
        while(i<n && groups[i]==0)
        i+=1;
        if(i<n){
        int tmp=groups[i];
        ans1.add(words[i]);
        for(int j=i+1;j<n;j++)
        {
            if(groups[j]!=tmp)
            {
                tmp=groups[j];
                ans1.add(words[j]);
            }
        }
        }
        i=0;
        while(i<n && groups[i]==1)
        i+=1;
        if(i<n){
        int tmp=groups[i];
        ans2.add(words[i]);
        for(int j=i+1;j<n;j++)
        {
            if(groups[j]!=tmp)
            {
                tmp=groups[j];
                ans2.add(words[j]);
            }
        }
        }
        if(ans1.size()>ans2.size())
        return ans1;
        return ans2;
    }
}