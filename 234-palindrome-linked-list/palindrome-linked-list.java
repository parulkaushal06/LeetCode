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
    public ListNode midNode(ListNode head){
        ListNode slow= head ;
        ListNode fast = head ;
        while(fast.next!= null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head ;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next ;
            curr.next = prev;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head ;
        ListNode mid = midNode(head);
        ListNode secondhalf = reverse(mid.next);
        mid.next = null;
        ListNode head1 = temp ;
        ListNode head2 = secondhalf ;
        while(head2 != null){
            if(head1.val != head2.val){
                return false ;
            }
            head1 = head1.next ;
            head2 = head2.next ;
        }
        return true ;
    }
}