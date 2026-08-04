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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                arr.add(temp.val);
                temp=temp.next;
            }
            
        }
        Collections.sort(arr);
        
        ListNode newList = new ListNode(-1);
        ListNode temp = newList;
        for (int i = 0; i < arr.size(); i++) { 
            ListNode newNode = new ListNode(arr.get(i));
            temp.next = newNode;
            temp = temp.next;
        }
        return newList.next;
    }
}
