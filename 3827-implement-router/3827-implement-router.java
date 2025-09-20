class Router {
    private class Packet
    {
        int source,destination,timestamp;
        Packet(int source,int destination,int timestamp)
        {
            this.source=source;
            this.destination=destination;
            this.timestamp=timestamp;
        }

        @Override
        public boolean equals(Object o)
        {
            if(this==o)
            return true;
            if(!(o instanceof Packet)) return false;
            Packet that=(Packet)o;
            return this.source==that.source && this.destination==that.destination && this.timestamp==that.timestamp;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(source,destination,timestamp);
        }
    }
    Queue<Packet> q;
    int cnt,ml;
    HashSet<Packet> hs;
    HashMap<Integer,ArrayList<Integer>> hm;
    public Router(int memoryLimit) {
        q=new LinkedList<>();
        cnt=0;
        ml=memoryLimit;
        hs=new HashSet<>();
        hm=new HashMap<>();
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        Packet np=new Packet(source,destination,timestamp);
        if(hs.contains(np))
        return false;
        if(cnt>=ml){
        Packet t=q.poll();
        hm.get(t.destination).remove(0);
        hs.remove(t);
        cnt-=1;
        }
        hs.add(np);
        q.add(np);
        cnt+=1;
        if(!hm.containsKey(destination))
        hm.put(destination,new ArrayList<>());
        hm.get(destination).add(timestamp);
        return true;
    }
    
    public int[] forwardPacket() {
        int arr[]=new int[3];
        if(cnt==0)
        return new int[0];
        Packet tp=q.poll();
        arr[0]=tp.source;
        arr[1]=tp.destination;
        arr[2]=tp.timestamp;
        hm.get(tp.destination).remove(0);
        hs.remove(tp);
        cnt-=1;
        return arr;
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        // ArrayList<Integer> ar=hm.get(destination);
        // // System.out.println(ar);
        // int fi=Collections.binarySearch(ar,startTime);
        // int li=Collections.binarySearch(ar,endTime);
        // if(fi<0)
        // fi=(-fi-1);
        // else
        // {
        //     int t=fi;
        //     while(t>=1 && ar.get(t)==ar.get(t-1))
        //     t-=1;
        //     fi=t;
        // }
        // if(li<0)
        // li=(-li-1);
        // else
        // {
        //     int t=li;
        //     while(t<ar.size()-1 && ar.get(t)==ar.get(t+1))
        //     t+=1;
        //     li=t;
        // }
        // int cnt=0;
        // for(int i=fi;i<=li && i<ar.size();i++)
        // {
        //     if(ar.get(i)>=startTime && ar.get(i)<=endTime)
        //     cnt+=1;
        // }
        // return cnt;
        ArrayList<Integer> ar = hm.get(destination);
        if (ar == null || ar.isEmpty()) return 0;

        // Binary search for first >= startTime
        int fi = Collections.binarySearch(ar, startTime);
        if (fi < 0) fi = -fi - 1;
        else {
            while (fi > 0 && ar.get(fi - 1) == startTime) fi--;
        }

        // Binary search for last <= endTime
        int li = Collections.binarySearch(ar, endTime);
        if (li < 0) li = -li - 2;
        else {
            while (li < ar.size() - 1 && ar.get(li + 1) == endTime) li++;
        }

        if (fi > li || fi >= ar.size() || li < 0) return 0;

        return li - fi + 1;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */