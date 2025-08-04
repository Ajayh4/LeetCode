class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0,cnt=0,i=0,j=0,n=fruits.length;
        while(i<n)
        {
            // System.out.println(i+" "+j);
            int v=fruits[i];
            hm.put(v,hm.getOrDefault(v,0)+1);
            if(hm.size()>2)
            {
                while(j<i)
                {
                    int tv=fruits[j];
                    hm.put(tv,hm.get(tv)-1);
                    j+=1;
                    if(hm.get(tv)==0)
                    {
                        hm.remove(tv);
                    break;
                    }
                }
            }
            ans=Math.max(ans,i-j+1);
            i+=1;
        }
        return ans;
    }
}