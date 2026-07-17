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
    public ListNode reverse(ListNode head){
        ListNode ptr1=head;
        if(head.next==null){
            return head;
        }
        ListNode ptr2=head.next;
        ptr1.next=null;
        if(ptr2.next==null){
            ptr2.next=ptr1;
            return ptr2;
        }
        ListNode ptr3=ptr2.next;
        while(ptr3!=null){
            ptr2.next=ptr1;
            ptr1=ptr2;
            ptr2=ptr3;
            ptr3=ptr3.next;
        }
        ptr2.next=ptr1;
        return ptr2;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null){
            return true;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow.next);
        slow.next=rev;
        ListNode curr=head;
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head=head.next;
            rev=rev.next;
        }
        return true;
    }
}