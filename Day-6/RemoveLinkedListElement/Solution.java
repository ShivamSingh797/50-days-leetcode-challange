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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        if(head==null){
            return null;
        }
        ListNode ptr1=head;
        ListNode ptr2=head.next;

        while(ptr2!=null){
            if(ptr2.val==val){
                ptr2=ptr2.next;
                ptr1.next=ptr2;
            }else{
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
            
        }
        return head;
    }
}