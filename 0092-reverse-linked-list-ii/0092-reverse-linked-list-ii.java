/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode root,int l,int r)
    {
        int cnt=1;
        ListNode ans=null,tmp=root;
        while(tmp!=null)
        {
            if(cnt>=l && cnt<=r){
            ListNode nn=new ListNode(tmp.val);
            if(ans==null)
            ans=nn;
            else
            {
                // ListNode t=nn;
                nn.next=ans;
                ans=nn;
            }
            }
            tmp=tmp.next;
            cnt+=1;
        }
        return ans;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tmp=head;
        ListNode rev=reverse(head,left,right);
        ListNode ans=null,t=null;
        int cnt=1;
        if(left==right)return head;
        while(tmp!=null)
        {
            ListNode nn=null;
            if(cnt>=left && cnt<=right){
            nn=new ListNode(rev.val);
            rev=rev.next;
            }
            else
            nn=new ListNode(tmp.val);
            if(ans==null)
            {
                ans=nn;
                t=nn;
            }
            else
            {
                t.next=nn;
                t=nn;
            }
            tmp=tmp.next;
            cnt+=1;
        }
        return ans;
    }
}