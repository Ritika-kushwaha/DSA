class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        curr = dummy;

        for (int i = 0; i < count - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}