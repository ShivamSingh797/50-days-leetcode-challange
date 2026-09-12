/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                break;
            }
        }
        if(fast.next==null || fast.next.next==null){
            return null;
        }
        int count=0;
        while(slow!=fast){
            count++;
            slow=slow.next;
            fast=fast.next;
        }
        if(slow==fast){
            return slow;
        }
        return null;
    }
}
