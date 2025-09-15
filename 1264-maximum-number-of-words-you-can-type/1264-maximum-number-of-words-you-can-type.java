class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int f[]=new int[26];
        for(int i=0;i<brokenLetters.length();i++)
        f[brokenLetters.charAt(i)-'a']+=1;
        int ans=0;
        String string_list[]=text.split(" ");
        for(String i: string_list)
        {
            int flag=1;
            for(char c: i.toCharArray())
            {
                if(f[c-'a']>0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            ans+=1;
        }
        return ans;
    }
}