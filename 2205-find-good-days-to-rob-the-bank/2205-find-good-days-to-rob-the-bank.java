class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n=security.length;
        int gt[]=new int[n];
        int lt[]=new int[n];
        gt[0]=1;
        lt[0]=1;
        int cnt=1;
        List<Integer> ans=new ArrayList<>();
        if(time==0)
        {
            for(int i=0;i<n;i++)
            ans.add(i);
            return ans;
        }
        else if(time==1)
        {
            for(int i=1;i<n-1;i++)
            {
                if(security[i]<=security[i-1] && security[i]<=security[i+1])
                ans.add(i);
            }
            return ans;
        }
        for(int i=1;i<n;i++)
        {
            if(security[i]>=security[i-1])
            cnt+=1;
            else
            cnt=1;
            lt[i]=cnt;
        }
        cnt=1;
        for(int i=1;i<n;i++)
        {
            if(security[i]<=security[i-1])
            cnt+=1;
            else
            cnt=1;
            gt[i]=cnt;
        }
        // System.out.println(Arrays.toString(lt));
        // System.out.println(Arrays.toString(gt));
        // if(lt[n-1]==n || gt[n-1]==n)return ans;
        for(int i=time;i<n-time;i++)
        {
            if(gt[i]>(time) && (lt[i+time]-lt[i])>=(time))
            ans.add(i);
        }
        return ans;
    }
}