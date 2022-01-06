class ListNode {
    int val;
    ListNode1 next;
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
    public static ListNode1 detectCycle(ListNode1 head) {
        if (head == null) { // Linked List khali he
            return null;
        }
        ListNode1 current = head, next = head.next;
        ListNode1 temp_point = new ListNode1();
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
        ListNode1 head = new ListNode1(3);
        ListNode1 temp1 = new ListNode1(2);
        ListNode1 temp2 = new ListNode1(0);
        ListNode1 temp3 = new ListNode1(-4);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = null; // not req
        System.out.println(detectCycle(head).val);
    }
}