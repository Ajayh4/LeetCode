class Pair
{
    int a,b;
    Pair(int x,int y)
    {
        a=x;
        b=y;
    }
}
class customsort implements Comparator<Pair>
{
    @Override
    public int compare(Pair a,Pair b)
    {
        double v1=(a.a+1)/((a.b+1)*1.0)-(a.a)/(a.b*1.0);
        double v2=(b.a+1)/((b.b+1)*1.0)-(b.a)/(b.b*1.0);
        if(v1>v2)
        return -1;
        return 1;
    }
}
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(new customsort());
        int n=classes.length;
        for(int i[]: classes)
        pq.add(new Pair(i[0],i[1]));
        for(int i=0;i<extraStudents;i++)
        {
            Pair t=pq.poll();
            pq.add(new Pair(t.a+1,t.b+1));
        }
        double ans=0;
        while(!pq.isEmpty())
        {
            Pair t=pq.poll();
            ans+=(t.a/(t.b*1.0));
        }
        return (ans/(n*1.0));
    }
}