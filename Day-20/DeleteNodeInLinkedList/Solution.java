/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr1=node;
        ListNode ptr2=node.next;
        ptr1.val=ptr2.val;
        ptr2=ptr2.next;
        ptr1.next=ptr2;
    }
}