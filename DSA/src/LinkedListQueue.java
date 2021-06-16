import java.util.NoSuchElementException;
interface Queue<E>{
    public boolean isEmpty();
    public E getFrontElement();
    public E getRearElement();
    public void enqueue(E theElement);
    public E dequeue();
    public String display();
    public int getSize();
    public int search(E theElement);
}
class QueueLL<E> implements Queue<E>{
    private class NodeQueueLL{
        E data;
        NodeQueueLL next;
        public NodeQueueLL() {
            this.data = null;
            this.next = null;
        }
        public NodeQueueLL(E theData) {
            this.data = theData;
            this.next = null;
        }
    }
    private NodeQueueLL front;
    private NodeQueueLL rear;
    private int size=0;
    public QueueLL(){
        this.front=null;
        this.rear=null;
    }

    public int getSize(){return size;}

    public boolean isEmpty(){return getSize()==0;}

    public E getFrontElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public E getRearElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public void enqueue(E theElement){
        NodeQueueLL newNode = new NodeQueueLL(theElement);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E dequeued = front.data;
        front = front.next;
        size--;
        return dequeued;
    }

    public String display(){
        NodeQueueLL currentNode = front;
        StringBuffer str = new StringBuffer("(Front) ");
        while(currentNode!=null){
            if(currentNode.data==null) {
                str.append("null, ");
            }
            else{
                str.append(currentNode.data.toString()+" - ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            str.delete(str.length()-2,str.length());
        }
        str.append("(Rear)");
        return new String(str);
    }

    public int search(E theElement){
        int index=0;
        NodeQueueLL currentNode = front;
        while(currentNode!=null){
            if(currentNode.data.equals(theElement)){
                return index; // returning the index of the found node
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1; // element_data not found
    }
}
