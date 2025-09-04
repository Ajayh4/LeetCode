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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans=null,t=null;
        ListNode dummy=null;
        int cnt=0;
        ListNode tmp=head;
        while(tmp!=null)
        {
            cnt+=1;
            ListNode nn=new ListNode(tmp.val);
            if(dummy==null)
                dummy=nn;
            else
            {
                nn.next=dummy;
                dummy=nn;
            }
            if(cnt==k)
            {
                cnt=0;
                while(dummy!=null)
                {
                    ListNode tnn=new ListNode(dummy.val);
                    if(ans==null)
                    {
                        ans=tnn;
                        t=tnn;
                    }
                    else
                    {
                        t.next=tnn;
                        t=tnn;
                    }
                    dummy=dummy.next;
                }
            }
            tmp=tmp.next;
        }
        while(dummy!=null)
        {
            ListNode tnn=new ListNode(dummy.val);
            if(ans==null)
            {
                ans=tnn;
                t=tnn;
            }
            else
            {
                ListNode tmp2=t.next;
                t.next=tnn;
                tnn.next=tmp2;
            }
            dummy=dummy.next;
        }
        return ans;
    }
}