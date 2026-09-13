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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode ptr = head;
        while (ptr != null) {
            list.add(ptr.val);
            ptr = ptr.next;
        }
        Collections.sort(list);
        ListNode head1=null;
        ListNode ptr2=null;
        for(Integer node:list){
            ListNode ele=new ListNode(node);
            if(head1!=null){
                ptr2.next=ele;
                ptr2=ele;
            }else{
                head1=ele;
                ptr2=ele;
            }
        }
        return head1;
    }
}