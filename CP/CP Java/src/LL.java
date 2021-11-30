class NodeLL{
    NodeLL next;
    int val;
}
class MyLinkedList {
    NodeLL head;
    int size;
    public MyLinkedList() {
        this.head = new NodeLL();
        this.head.next=null;
        this.head.val=0;
        this.size=0;
    }

    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        else{
            NodeLL tempNode = head;
            for(int i=0;i<index;i++){
                tempNode = tempNode.next;
            }
            return tempNode.val;
        }
    }

    public void addAtHead(int val) {
        NodeLL newNode = new NodeLL();
        newNode.val = val;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
        }
        if(index>0 && index<=size){
            NodeLL tempNode = head;
            for(int i=0;i<index-1;i++){
                tempNode = tempNode.next;
            }
            NodeLL newNode = new NodeLL();
            newNode.val = val;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        else if(index==0){
            head = head.next;
            size--;
        }
        else{
            NodeLL tempNode = head;
            for(int i=0;i<index-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
            return;
        }
    }

    public void display(){
        NodeLL temp = head;
        for(int i=0;i<this.size;i++){
            System.out.print(temp.val+" - ");
            temp=temp.next;
        }
    }
}

class Main2{
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        l1.addAtIndex(0,10);
        l1.addAtIndex(0,20);
        l1.addAtIndex(1,30);
        l1.display();
    }
}