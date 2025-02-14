class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; 
        }
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        int mid = size / 2;
        current = head;
        ListNode prev = null;
        
        for (int i = 0; i < mid; i++) {
            prev = current;
            current = current.next;
        }
        if (prev != null) {
            prev.next = current.next; 
        }
        
        return head; 
    }
}
