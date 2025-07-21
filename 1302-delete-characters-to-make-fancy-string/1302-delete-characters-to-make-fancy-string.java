class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n-2;i++)
        {
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2))
            continue;
            sb.append(s.charAt(i));
        }
        if((n-2)>=0)
        sb.append(s.charAt(n-2));
        if((n-1)>=0)
        sb.append(s.charAt(n-1));
        return sb.toString();
    }
}