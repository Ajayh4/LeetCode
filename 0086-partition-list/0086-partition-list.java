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
    public ListNode partition(ListNode head, int x) {
        ListNode ln=null,t1=null;
        ListNode gn=null,t2=null;
        ListNode tmp=head;
        while(tmp!=null)
        {
            ListNode nn=new ListNode(tmp.val);
            if(tmp.val<x)
            {
                if(ln==null)
                {
                    ln=nn;
                    t1=nn;
                }
                else
                {
                    t1.next=nn;
                    t1=nn;
                }
            }
            else
            {
                if(gn==null)
                {
                    gn=nn;
                    t2=nn;
                }
                else
                {
                    t2.next=nn;
                    t2=nn;
                }
            }
            tmp=tmp.next;
        }
        if(t1==null)
        return gn;
        t1.next=gn;
        return ln;
    }
}