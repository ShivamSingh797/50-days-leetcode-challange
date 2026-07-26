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
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode head1=dummy1;
        ListNode head2=dummy2;
        ListNode ptr=head;
        while(ptr!=null){
            ListNode temp=new ListNode(ptr.val);
            if(ptr.val<x){
                dummy1.next=temp;
                dummy1=temp;
            }else{
                dummy2.next=temp;
                dummy2=temp;
            }
            ptr=ptr.next;
        }
        dummy1.next=head2.next;
        return head1.next;
    }
}