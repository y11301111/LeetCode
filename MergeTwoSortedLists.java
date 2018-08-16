/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode t = l;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                l.next = l2;
                break;
            }
            if(l2 == null) {
                l.next = l1;
                break;
            }
            if(l1.val > l2.val) {
                l.next = l2;
                l2 = l2.next;
                l = l.next;
                continue;
            }else{
                l.next = l1;
                l1 = l1.next;
                l = l.next;
            }
        }
        return t.next;
    }
}