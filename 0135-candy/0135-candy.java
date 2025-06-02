class Solution {
  public int candy(int[] ratings) {
    int n=ratings.length;
    int r[]=new int[n];
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<n;i++)
    hm.put(i,ratings[i]);
    List<Map.Entry<Integer,Integer>> ll=new LinkedList<>(hm.entrySet());
    Collections.sort(ll,(a,b)->Integer.compare(a.getValue(),b.getValue()));
    LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<>();
    for(Map.Entry<Integer,Integer> i: ll)
    lm.put(i.getKey(),i.getValue());
    System.out.println(lm);
    for(int i: lm.keySet())
    {
      int v=i;
      if((v-1)>=0 && r[v-1]==0 && (v+1)<n && r[v+1]==0)
      r[v]=1;
      else
      {
        int f=1;
        if(v-1>=0 && ratings[v]>=ratings[v-1])
        {
          f=0;
          if(ratings[v]==ratings[v-1])
          r[v]=1;
          else
          {
            int p=Math.max(r[v],r[v-1]+1);
            r[v]=p;
          }
        }
        if(v+1<n && ratings[v]>=ratings[v+1])
        {
          f=0;
          if(ratings[v+1]==ratings[v])
          r[v]=Math.max(1,r[v]);
          else{
          r[v]=Math.max(r[v],r[v+1]+1);
          }
        }
        if(f==1)
        r[v]=1;
      }   
      //System.out.println(Arrays.toString(r));  
    }
    int ans=0;
    for(int i: r)
    ans+=i;
    return ans;
  }
}