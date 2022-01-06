class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }
class BadSolution {
    public static void main(String[] args) {
        BadSolution obj = new BadSolution();
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(2);
        head.next.next.next = new ListNode1(1);
        head.next.next.next.next=null;
        System.out.println(obj.isPalindrome(head));

    }
    public boolean isPalindrome(ListNode1 head) {
        if(head.next==null){
            return true;
        }

        ListNode1 temp = head;
        int size = 0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        if(size%2==0){
            for(int i=1;i<size/2;i++){
                temp=temp.next;
            }
        }
        else{
            for(int i=1;i<=size/2;i++){
                temp=temp.next;
            }
        }

        System.out.println(size);
        System.out.println(temp.val);

        System.out.println("initial");
        printLL(head);

        ListNode1 newhead = temp.next;
        temp.next=null;
        newhead = reverseList(newhead);

        System.out.println("final");
        printLL(head);
        printLL(newhead);

        temp=head;
        while(newhead!=null){
            if(newhead.val!=temp.val){
                return false;
            }
            newhead=newhead.next;
            temp=temp.next;
        }
        return true;
    }

    public void printLL(ListNode1 head){
        ListNode1 temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public ListNode1 reverseList(ListNode1 head) {
         if(head==null || head.next==null){
             return head;
         }
         ListNode1 current=head, next=current.next, next_to_next;
         while(next!=null){
             next_to_next=next.next;
             next.next = current;
             current=next;
             next=next_to_next;
         }
         head.next=null;
         head=current;
         return head;
    }
}
