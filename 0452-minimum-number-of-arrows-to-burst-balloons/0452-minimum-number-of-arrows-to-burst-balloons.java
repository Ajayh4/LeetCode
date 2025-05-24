class Solution {
    static boolean canm(int a[],int b[])
    {
        if(a[1]>=b[0])
        return true;
        // System.out.println("hello");
        return false;
    }
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> {
            if(a[1]==b[1])
            return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });
        // for(int i[]: points)
        // System.out.print(Arrays.toString(i));
        // System.out.println();
        int ans=1;
        int me=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(me>=points[i][0] && points[i][1]>=me)
            continue;
            else
            {
                ans+=1;
                me=points[i][1];
            }
        }
        return ans;
    }
}