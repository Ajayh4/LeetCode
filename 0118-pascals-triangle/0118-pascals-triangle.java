class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> ar=new ArrayList<>();
        ar.add(1);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(ar);
        if(numRows==1)
        return ans;
        List<Integer> ar2=new ArrayList<>();
        ar2.add(1);
        ar2.add(1);
        ans.add(ar2);
        if(numRows==2)
        return ans;
        for(int i=2;i<numRows;i++)
        {
            List<Integer> tmp=new ArrayList<>();
            // System.out.println(ans.get(i-1));
            tmp.add(1);
            for(int j=0;j<i-1;j++)
            tmp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j+1));
            tmp.add(1);
            ans.add(tmp);
        }
        return ans;
    }
}