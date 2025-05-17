class Solution {
    public void sortColors(int[] nums) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i: nums)
        {
            if(tm.containsKey(i))
            tm.put(i,tm.get(i)+1);
            else
            tm.put(i,1);
        }
        int k=0;
        for(int i: tm.keySet())
        {
            for(int j=0;j<tm.get(i);j++)
            nums[k++]=i;
        }
    }
}