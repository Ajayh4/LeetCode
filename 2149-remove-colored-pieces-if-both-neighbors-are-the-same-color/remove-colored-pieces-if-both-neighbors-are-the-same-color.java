class Solution {
    public boolean winnerOfGame(String c) {
        int a=0,b=0;
        for(int i=1;i<c.length()-1;i++)
        {
            if(c.charAt(i)==c.charAt(i+1) && c.charAt(i)==c.charAt(i-1))
            {
                if(c.charAt(i)=='A')
                a+=1;
                else
                b+=1;
            }
        }
        if(a<=b)
        return false;
        return true;
    }
}