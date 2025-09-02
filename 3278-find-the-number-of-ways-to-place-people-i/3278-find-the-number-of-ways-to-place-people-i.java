class Solution {
    public int numberOfPairs(int[][] points) {
        int ans=0,n=points.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    int x1=points[i][0],y1=points[i][1],x2=points[j][0],y2=points[j][1];
                    if(x1<=x2 && y1>=y2){
                        // System.out.println(x1+" "+y1+" "+x2+" "+y2);
                        boolean flag=false;
                        for(int k=0;k<n;k++)
                        {
                            if(i!=k && j!=k)
                            {
                                int x3=points[k][0],y3=points[k][1];
                                if(x3>=x1 && x3<=x2 && y3>=y2 && y3<=y1)
                                {
                                    flag=true;
                                    break;
                                }
                            }
                        }
                        if(!flag)
                        ans+=1;
                    }
                }
            }
        }
        return ans;
    }
}