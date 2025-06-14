class Solution {
    public String largestMerge(String word1, String word2) {
        int i=0,j=0,n1=word1.length(),n2=word2.length();
        StringBuilder ans=new StringBuilder();
        while(i<n1 && j<n2)
        {
            if(word1.charAt(i)>word2.charAt(j))
            {
                ans.append(word1.charAt(i));
                i+=1;
            }
            else if(word1.charAt(i)>word2.charAt(j))
            {
                ans.append(word2.charAt(j));
                j+=1;
            }
            else
            {
                // System.out.println(word1.substring(i,n1)+" "+word2.substring(j,n2));
                if(word1.substring(i,n1).compareTo(word2.substring(j,n2))>=0)
                {
                    ans.append(word1.charAt(i));
                i+=1;
                }
                else
                {
                    ans.append(word2.charAt(j));
                j+=1;
                }
            }
        }
        while(i<n1)
        {
            ans.append(word1.charAt(i));
            i+=1;
        }
        while(j<n2)
        {
            ans.append(word2.charAt(j));
            j+=1;
        }
        return ans.toString();
    }
}