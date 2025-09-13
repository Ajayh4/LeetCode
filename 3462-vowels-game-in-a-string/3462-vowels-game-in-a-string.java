class Solution {
    public boolean doesAliceWin(String s) {
        String vow="aeiou";
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(vow.contains(c+""))
            cnt+=1;
        }
        if(cnt==0)
        return false;
        return true;
    }
}