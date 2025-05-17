class Solution {
    public String largestNumber(int[] arr) {
        String nums[]=new String[arr.length];
        for(int i=0;i<arr.length;i++)
        nums[i]=Integer.toString(arr[i]);
        Arrays.sort(nums, (a,b) ->{
            int n=a.length(),m=b.length();
            for(int i=0;i<Math.min(n,m);i++)
            {
                if(a.charAt(i)==b.charAt(i))
                continue;
                else if(a.charAt(i)<b.charAt(i))
                return 1;
                else
                return -1;
            }
            String t1=a+b,t2=b+a;
            for(int i=0;i<t1.length();i++)
            {
                if(t1.charAt(i)==t2.charAt(i))
                continue;
                if(t1.charAt(i)>t2.charAt(i))
                return -1;
                else
                return 1;
            }
            return 0;
        });
        String r="";
        for(String i: nums)
        r+=i;
        int i=0;
        if(r.charAt(i)=='0')
        {
            while(i<r.length()-1 && r.charAt(i)=='0')
            i+=1;
            return r.substring(i,r.length());
        }
        return r;
    }
}