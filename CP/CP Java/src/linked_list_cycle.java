class ListNode {
    int val;
    ListNode next;
    ListNode() {
        val = 0;
        next = null;
    }
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution5 {
    public static ListNode detectCycle(ListNode head) {
        if (head == null) { // Linked List khali he
            return null;
        }
        ListNode current = head, next = head.next;
        ListNode temp_point = new ListNode();
        while (current != null && next != null) {
            next = current.next;
            if (current.next != temp_point) {
                current.next = temp_point;
            } else {
                return current;
            }
            current = next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(0);
        ListNode temp3 = new ListNode(-4);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = null; // not req
        System.out.println(detectCycle(head).val);
    }
}