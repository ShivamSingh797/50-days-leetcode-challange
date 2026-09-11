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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode prev = null;
        ListNode ptr1=head;
        ListNode ptrL=null;
        ListNode ptrN=null;
        for(int i=1;i<left;i++){
            prev=ptr1;
            ptr1=ptr1.next;
        }
        ptrL=ptr1;
        ptrN=ptr1.next;
        for(int i=0;i<(right-left);i++){
            ListNode next=ptrN.next;
            ptrN.next=ptr1;
            ptr1=ptrN;
            ptrN=next;
        }
        ptrL.next=ptrN;
        if (prev == null)
            head = ptr1;
        else
            prev.next = ptr1;
        return head;
    }
}
