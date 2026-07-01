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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode ptr1=head.next;
        ListNode ptr2=head.next.next;
        head.next=null;
        while(ptr2!=null){
            ptr1.next=head;
            head=ptr1;
            ptr1=ptr2;
            ptr2=ptr2.next;
        }
        ptr1.next=head;
        return ptr1;
    }
}