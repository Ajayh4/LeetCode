class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<gs.length;i++)
        {
            if(!hm.containsKey(gs[i]))
            hm.put(gs[i],new ArrayList<Integer>(Arrays.asList(i)));
            else
            hm.get(gs[i]).add(i);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i: hm.keySet())
        {
            ArrayList<Integer> x=hm.get(i);
            ArrayList<Integer> t=new ArrayList<>();
            for(int j=0;j<x.size();j++)
            {
                //System.out.println(t);
                if(t.size()==i)
                {
                    res.add(t);
                    t=new ArrayList<>();
                }
                t.add(x.get(j));
            }
            if(t.size()!=0)
            res.add(t);
        }
        return res;
    }
}