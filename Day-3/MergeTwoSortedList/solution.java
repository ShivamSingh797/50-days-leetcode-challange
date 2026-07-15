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

public class solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1=list1;
        ListNode ptr2=list2;
        ListNode head=null;
        ListNode temp=head;

        if(ptr1==null){
            return ptr2;
        }
        if(ptr2==null){
            return ptr1;
        }

        while(ptr1!=null && ptr2!=null){
        if(ptr1.val<=ptr2.val){
            if(head==null){
                head=temp=ptr1;
            }else{
                temp.next=ptr1;
                temp=ptr1;
            }
            ptr1=ptr1.next;
        }else{
            if(head==null){
                head=temp=ptr2;
            }else{
                temp.next=ptr2;
                temp=ptr2;
            }
            ptr2=ptr2.next;
        }
        }
       if(ptr1 != null)
            temp.next = ptr1;

        if(ptr2 != null)
            temp.next = ptr2;
        return head;
    }
}
