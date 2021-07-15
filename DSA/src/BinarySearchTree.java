class BST_Node{
    private int data;
    private BST_Node leftChild;
    private BST_Node rightChild;

    public BST_Node(int data) {
        this.data = data;
    }

    public void insertNode(int value){
        if(data==value){
            System.out.println("Duplicate values aren't allowed.");
            return;
        }
        else if(data>value){
            if(leftChild==null){
                leftChild=new BST_Node(value);
            }
            else{
                leftChild.insertNode(value);
            }
        }
        else{
            if(rightChild==null){
                rightChild=new BST_Node(value);
            }
            else{
                rightChild.insertNode(value);
            }
        }
    }

    public void traversalInOrder_print(){ // Inorder Traversal karega
        if(leftChild!=null){
            leftChild.traversalInOrder_print();
        }
        System.out.print(data+", ");
        if(rightChild!=null){
            rightChild.traversalInOrder_print();
        }
    }

    @Override
    public String toString() {
        if(this!=null){
            return "Node{" + "data = " + data + '}';
        }
        else{
            return "Node{data = null}";
        }
    }

    public BST_Node get(int value){
        // Iterative
//        BST_Node currentNode = this;
//        while(currentNode!=null && currentNode.data!=value){
//            if(currentNode.data>value){
//                currentNode = currentNode.leftChild;
//            }
//            else{
//                currentNode = currentNode.rightChild;
//            }
//        }
//        return currentNode;

        // recursive
        if(value==data){
            return this;
        }
        else if (value<data && leftChild!=null){
            return leftChild.get(value);
        }
        else if(value>data && rightChild!=null){
            return rightChild.get(value);
        }
        return null;
    }

    public BST_Node getMin(){
        // Iterative method
//        BST_Node currentNode = this;
//        while(currentNode.leftChild!=null){
//            currentNode = currentNode.leftChild;
//        }
//        return currentNode;

        // Recursive method
        if(leftChild==null){
            return this;
        }
        return leftChild.getMin();
    }

    public BST_Node getMax(){
        // Iterative method
//        BST_Node currentNode = this;
//        while(currentNode.rightChild!=null){
//            currentNode = currentNode.rightChild;
//        }
//        return currentNode;

        // Recursive method
        if(rightChild==null){
            return this;
        }
        return rightChild.getMax();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BST_Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BST_Node leftChild) {
        this.leftChild = leftChild;
    }

    public BST_Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(BST_Node rightChild) {
        this.rightChild = rightChild;
    }
}

class BST{ // BST - Binary Search Tree
    // This implementation of BST doesn't allow duplicate values.
    private BST_Node rootNode;

    public void BST_InsertNode(int value){
        if(rootNode==null){ // Tree is empty
            rootNode = new BST_Node(value);
            return;
        }
        rootNode.insertNode(value);
    }

    public void BST_Traversal_Print(){
        if(rootNode==null){
            System.out.println("null");
            return;
        }
        rootNode.traversalInOrder_print();
        System.out.println();
    }

    public BST_Node getNode(int value){
        if(rootNode==null){
            return rootNode;
        }
        return rootNode.get(value);
    }

    public BST_Node getMaxNode(){
        if(rootNode==null){
            return rootNode;
        }
        return rootNode.getMax();
    }

    public BST_Node getMinNode(){
        if(rootNode==null){
            return rootNode;
        }
        return rootNode.getMin();
    }
}

class Test{
    public static void main(String[] args) {
        BST t1 = new BST();
        t1.BST_InsertNode(1);
        t1.BST_InsertNode(2);
        t1.BST_InsertNode(3);
        t1.BST_InsertNode(-1);

        System.out.print("t1 is - ");
        t1.BST_Traversal_Print();

        System.out.println("\nSearching for nodes in t1 - ");
        BST_Node searchNode1 = t1.getNode(2);
        System.out.println(searchNode1);
        BST_Node searchNode2 = t1.getNode(0);
        System.out.println(searchNode2);

        System.out.println("\nMax and Min of t1 - ");
        System.out.println("max - "+t1.getMaxNode());
        System.out.println("min - "+t1.getMinNode());

        BST t2 = new BST();
        System.out.print("\nt2 is - ");
        t2.BST_Traversal_Print();
        System.out.println("\nMax and Min of t2 - ");
        System.out.println("max - "+t2.getMaxNode());
        System.out.println("min - "+t2.getMinNode());
    }
}
