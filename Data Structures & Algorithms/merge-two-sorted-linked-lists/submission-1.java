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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode newlist=new ListNode(0);
        ListNode temp=newlist;
        ListNode t1=list1, t2=list2;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                t2=t2.next;
            }
            
            temp=temp.next;
        }


        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }
        return newlist.next;
    }
}