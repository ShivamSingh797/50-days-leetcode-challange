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
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        while(ptr2!=null){
            ListNode temp=new ListNode(gcd(ptr1.val,ptr2.val));
            ptr1.next=temp;
            temp.next=ptr2;
            ptr1=ptr2;
            ptr2=ptr2.next;
        }
        return head;
    }
}
