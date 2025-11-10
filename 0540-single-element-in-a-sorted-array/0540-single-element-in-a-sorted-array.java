class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=0,h=arr.length-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(((m-1)>=0 && arr[m]!=arr[m-1]) && ((m+1)<h && arr[m]!=arr[m+1]))
            return arr[m];
            else if((m%2==0 && (m+1)<h && arr[m+1]==arr[m]) || (m%2==1 && (m-1)>=0 && arr[m]==arr[m-1]))
            l=m+1;
            else
            h=m-1;
        }
        return arr[l];
    }
}