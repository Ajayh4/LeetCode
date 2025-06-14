class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        char c=chars[0],cnt=1;
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i]==c)
            {
                cnt+=1;
            }
            else
            {
                if(cnt>1){
                    sb.append(c);
                    sb.append(Integer.toString(cnt));
                }
                else
                sb.append(c);
                c=chars[i];
                cnt=1;
            }
        }
        if(cnt>1)
        {
            sb.append(c);
            sb.append(Integer.toString(cnt));
        }
        else
        sb.append(c);
        // System.out.println(sb);
        for(int i=0;i<sb.length();i++)
        chars[i]=sb.charAt(i);
        return sb.length();
    }
}