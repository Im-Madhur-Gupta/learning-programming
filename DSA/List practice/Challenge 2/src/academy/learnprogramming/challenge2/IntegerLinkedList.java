package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        // Beautiful ALGO -
        if(size==0 || value <= head.getValue()){
            addToFront(value);
        }
        else{
            IntegerNode previousNode = head;
            IntegerNode currentNode = head.getNext();
            while(currentNode!=null && value>currentNode.getValue()){
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            IntegerNode insertNode = new IntegerNode(value);
            insertNode.setNext(currentNode);
            previousNode.setNext(insertNode);
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
