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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        int carry=0;
        int sum=0;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(ptr1!=null && ptr2!=null){
            sum=ptr1.val+ptr2.val+carry;
            if(sum<=9){
                dummy.next=new ListNode(sum);
                carry=0;
            }else{
                dummy.next=new ListNode(sum-10);
                carry=1;
            }
            dummy=dummy.next;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        while(ptr1!=null){
            sum=ptr1.val+carry;
            if(sum<=9){
                dummy.next=new ListNode(sum);
                carry=0;
            }else{
                dummy.next=new ListNode(sum-10);
                carry=1;
            }
            dummy=dummy.next;
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            sum=ptr2.val+carry;
            if(sum<=9){
                dummy.next=new ListNode(sum);
                carry=0;
            }else{
                dummy.next=new ListNode(sum-10);
                carry=1;
            }
            dummy=dummy.next;
            ptr2=ptr2.next;
        }
       
        if(carry==1){
            dummy.next=new ListNode(1);
        }
        return temp.next;
    }
}