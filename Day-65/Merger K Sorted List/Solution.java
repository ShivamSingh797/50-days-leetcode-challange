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
    static ListNode sortedMerge(ListNode a, ListNode b)
    {
        if (a == null)
            return b;
        if (b == null)
            return a;
        ListNode head = null, tail = null;
        if (a.val <= b.val) {
            head = tail = a;
            a = a.next;
        }
        else {
            head = tail = b;
            b = b.next;
        }
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null) {
            tail.next = b;
        }
        else {
            tail.next = a;
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode head1 = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head1 = sortedMerge(head1, lists[i]);
        }
        return head1;
    }
}