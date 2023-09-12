class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            hm.put(s.charAt(i),1);
            else
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        ArrayList<Integer> a=new ArrayList<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        int m=0;
        for(char i: hm.keySet())
        {
            int v=hm.get(i);
            m=Math.max(m,v);
            if(!tm.containsKey(v))
            tm.put(v,1);
            else
            tm.put(v,tm.get(v)+1);
        }
        int f[]=new int[m+2];
        for(int i: tm.keySet())
        {
            f[i]=1;
            if(tm.get(i)>1)
            {
                for(int j=0;j<tm.get(i)-1;j++)
                a.add(i);
            }
        }
        int cnt=0;
        for(int i: a)
        {
            int d=i-1;
            while(d>=0)
            {
                cnt+=1;
                if(f[d]==0)
                {
                    f[d]=1;
                    break;
                }
                d-=1;
            }
        }
        return cnt;
    }
}