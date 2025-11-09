class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0,i=0,j=0,n=s.length();
        HashSet<Character> hs=new HashSet<>();
        while(j<n)
        {
            char c=s.charAt(j);
            if(!hs.contains(c)){
            hs.add(c);
            // ans=Math.max(ans,j-i);
            }
            else{
                while(i<j && s.charAt(i)!=c){
                hs.remove(s.charAt(i));
                i+=1;
                }
                // hs.remove()
                i+=1;
            }
            
            ans=Math.max(ans,j-i+1);
            j+=1;
        }
        return ans;
    }
}