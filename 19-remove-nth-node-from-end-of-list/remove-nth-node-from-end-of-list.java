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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head ;
        ListNode temp = head ;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next ;
        }
        temp = dummy ;
        for(int i=0; i<size - n ; i++){
            temp = temp.next ;
        }
        temp.next = temp.next.next ;
        return dummy.next ;
    }
}