class Solution {
    public int minMaxDifference(int num) {
        int ans=0;
        String s=Integer.toString(num);
        String ma=s,mi=s;
        for(char c: s.toCharArray())
        {
            if(c!='9')
            {
                ma=s.replace(c+"","9");
                break;
            }
        }
        for(char c: s.toCharArray())
        {
            if(c!='0')
            {
                mi=s.replace(c+"","0");
                break;
            }
        }
        // System.out.println(ma+" "+mi);
        // return 0;
        return Integer.parseInt(ma)-Integer.parseInt(mi);
    }
}