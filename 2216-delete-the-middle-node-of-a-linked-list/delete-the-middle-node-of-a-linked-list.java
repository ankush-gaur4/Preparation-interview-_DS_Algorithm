
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevSlow = null;
        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // If there's only one node
        if(prevSlow == null) {
            return null;
        }

        prevSlow.next = slow.next;

        return head;
    }
}