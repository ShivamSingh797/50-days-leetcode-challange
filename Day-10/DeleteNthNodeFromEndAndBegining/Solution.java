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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode ptr1=head;
        ListNode ptr2=head;
        ListNode prev=null;
        while(n>1){
            ptr1=ptr1.next;
            n--;
        }
        if(ptr1.next==null){
            return head.next;
        }
        while(ptr1.next!=null){
            ptr1=ptr1.next;
            prev=ptr2;
            ptr2=ptr2.next;
        }
        prev.next=ptr2.next;
        ptr2.next=null;
        return head;
    }
}
