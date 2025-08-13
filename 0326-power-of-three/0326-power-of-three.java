class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)return true;
        if(n<0)return false;
        if(n<3)return false;
        while(n>=3)
        {
            if(n%3!=0)
            return false;
            n/=3;
        }
        if(n==1)
        return true;
        return false;
    }
}