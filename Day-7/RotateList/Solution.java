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
    public ListNode rotateRightByOne(ListNode head){
        if(head==null){
            return null;
        }
        ListNode ptr1=head;
        if(ptr1.next==null){
            return head;
        }
        ListNode ptr2=head.next;
        while(ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr1.next=null;
        ptr2.next=head;
        head=ptr2;
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        k=k%len;
        ListNode revisedHead=head;
        for(int i=0;i<k;i++){
            revisedHead=rotateRightByOne(revisedHead);
        }
        return revisedHead;
    }
}