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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ptr1=head;
        ListNode end=head;
        ListNode begin=head;
        while(k>1){
            ptr1=ptr1.next;
            k--;
        }
        begin=ptr1;
        while(ptr1.next!=null){
            end=end.next;
            ptr1=ptr1.next;
        }
        int temp=begin.val;
        begin.val=end.val;
        end.val=temp;

        return head;
    }
}
