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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while (temp!=null){
            list.add(temp.val);   
            temp=temp.next;         
        }
        int width=(list.size()%2==0)?list.size()/2:list.size()/2+1;
        Stack<Integer> stack=new Stack<>();
         int i=0;
         int j=list.size()-1;
         int c=0;
        while(i<=j){
            if(c%2==0){
                stack.push(list.get(i));
                i++;
            }
            else{
                stack.push(list.get(j));
                j--;
            }
            c++;
        }
        Collections.reverse(stack);

        temp=head;
        while(temp!=null){
            int newval=stack.pop();
            temp.val=newval;
            temp=temp.next;
        }
    }
}
