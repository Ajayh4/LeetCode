class Node
{
    int pid,tid;
    Node prev,next;
    Node(int uid,int tid)
    {
        this.pid=uid;
        this.tid=tid;
        prev=null;
        next=null;
    }
}
class Twitter {
    HashMap<Integer,ArrayList<Integer>> hm;
    Node root,tail;
    public Twitter() {
        hm=new HashMap<>();
        root=null;
        tail=null;
    }
    
    public void postTweet(int userId, int tweetId) {
        Node nn=new Node(userId,tweetId);
        if(!hm.containsKey(userId))
        hm.put(userId,new ArrayList<>());
        hm.get(userId).add(userId);
        if(root==null)
        {
            root=nn;
            tail=nn;
        }
        else
        {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans=new ArrayList<>();
        Node tmp=tail;
        int cnt=0;
        if(!hm.containsKey(userId))return ans;
        while(tmp!=null && cnt<10)
        {
            if(hm.get(userId).contains(tmp.pid))
            {
                ans.add(tmp.tid);
                cnt+=1;
            }
            tmp=tmp.prev;
        }
        // Collections.reverse(ans);
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!hm.containsKey(followerId))
        hm.put(followerId, new ArrayList<>());
        hm.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        // if(hm.get(followerId).contains(followeeId))
        hm.get(followerId).remove(new Integer(followeeId));
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */