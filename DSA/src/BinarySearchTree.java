import java.util.NoSuchElementException;

class BST_Node{
    int data;
    BST_Node leftChild;
    BST_Node rightChild;

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

    public BST_Node search(int value){
        // Iterative -
//        BST_Node currentNode = rootNode;
//        while(currentNode!=null && currentNode.data!=value){
//            if(currentNode.data>value){
//                currentNode = currentNode.leftChild;
//            }
//            else{
//                currentNode = currentNode.rightChild;
//            }
//        }
//        return currentNode;

        // Recursive Call initiator -
        return search(rootNode,value);
    }
    private BST_Node search(BST_Node tempNode,int value){
        // Recursive -
        if(tempNode==null || tempNode.data==value){
            return tempNode;
        }
        if(tempNode.data<value){
            return search(tempNode.rightChild,value);
        }
        return search(tempNode.leftChild,value);
    }
    public int getMax(){
        if(rootNode==null){
            throw new IllegalArgumentException();
        }
        return rootNode.getMax().data;
    }
    public int getMin(){
        if(rootNode==null){
            throw new IllegalArgumentException();
        }
        return rootNode.getMin().data;
    }

    public void deleteNode(int value){
        if(rootNode==null){
            throw new IllegalArgumentException("Root of Tree is NULL.");
        }
        deleteNodeRecur(rootNode,value);
    }
    private BST_Node deleteNodeRecur(BST_Node subRoot,int value){
        if(subRoot==null){
            throw new IllegalArgumentException("Value not found");
        }

        if(value<subRoot.data){
            subRoot.leftChild = deleteNodeRecur(subRoot.leftChild,value); // iska matlab ye ki subroot ki left branch me change karna padega
        }
        else if(value>subRoot.data){
            subRoot.rightChild = deleteNodeRecur(subRoot.rightChild,value); // subroot ki right branch me change karna padega.
        }
        else{
            if(subRoot.leftChild==null){
                return subRoot.rightChild;
            }
            else if(subRoot.rightChild==null){
                return subRoot.leftChild;
            }

            BST_Node successor = subRoot.rightChild, parent = subRoot;
            while(successor.leftChild!=null){
                parent = successor;
                successor = successor.leftChild;
            }
            subRoot.data=successor.data;
            if(parent==subRoot){
                subRoot.rightChild = successor.rightChild;
            }
            else{
                parent.leftChild=successor.rightChild;
            }

        }
        return subRoot;
    }
}

class Test{
    public static void main(String[] args) {
        BST t1 = new BST();
        t1.BST_InsertNode(25);
        t1.BST_InsertNode(20);
        t1.BST_InsertNode(27);
        t1.BST_InsertNode(15);
        t1.BST_InsertNode(17);
        t1.BST_InsertNode(16);
        t1.BST_InsertNode(22);
        t1.BST_InsertNode(26);
        t1.BST_InsertNode(30);
        t1.BST_InsertNode(29);
        t1.BST_InsertNode(32);

        System.out.print("t1 is - ");
        t1.BST_Traversal_Print();

//        System.out.println("\nSearching for nodes in t1 - ");
//        BST_Node searchNode1 = t1.search(2);
//        System.out.println(searchNode1);
//        BST_Node searchNode2 = t1.search(0);
//        System.out.println(searchNode2);
//
//        System.out.println("\nMax and Min of t1 - ");
//        System.out.println("max - "+t1.getMax());
//        System.out.println("min - "+t1.getMin());

        t1.deleteNode(20);
        t1.BST_Traversal_Print();
        t1.deleteNode(16);
        t1.BST_Traversal_Print();
        t1.deleteNode(25);
        t1.BST_Traversal_Print();

//        t1.deleteNode(4); // 4 is not in tree, will thorw value not found error

//        BST t2 = new BST();
//        t2.deleteNode(2); // as its an empty tree error will be thrown.
    }
}
