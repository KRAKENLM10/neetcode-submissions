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
        if (l1.val == 0 && l2.val == 0) {
            ListNode newhead = new ListNode(0);
            return newhead;
        }
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode newhead = new ListNode();
        ListNode temp = newhead;
        while (temp1 != null || temp2 != null || carry != 0) {
            int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode dummy = new ListNode(digit);

            temp.next = dummy;
            temp = temp.next;
            
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
        return newhead.next;
    }
}
