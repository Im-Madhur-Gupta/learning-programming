class BST_Node{
    int data;
    BST_Node leftChild;
    BST_Node rightChild;

    public BST_Node(int data) {
        this.data = data;
    }

    public void traversalInOrder(){ // Inorder Traversal karega
        if(leftChild!=null){
            leftChild.traversalInOrder();
        }
        System.out.print(data+", ");
        if(rightChild!=null){
            rightChild.traversalInOrder();
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

    public void insertNode(int value){
        rootNode = insertNode(rootNode,value);
    }
    private BST_Node insertNode(BST_Node tempNode, int value){
        if(tempNode==null){
            return new BST_Node(value);
        }

        if(tempNode.data>value){
            tempNode.leftChild = insertNode(tempNode.leftChild,value);
            // avl code will be added here
        }
        else if(tempNode.data<=value){
             tempNode.rightChild = insertNode(tempNode.rightChild,value);
            // avl code will be added here
        }
        return tempNode;
    }

    public void Traversal_inorder(){
        if(rootNode==null){
            System.out.println("null");
            return;
        }
        rootNode.traversalInOrder();
        System.out.println();
    }

    public void Traversal_preorder(){
        if(rootNode==null){
            return;
        }
        Traversal_preorder(rootNode);
    }
    private void Traversal_preorder(BST_Node tempNode){
        System.out.print(tempNode.data+", ");
        if(tempNode.leftChild!=null){
            Traversal_preorder(tempNode.leftChild);
        }
        if(tempNode.rightChild!=null){
            Traversal_preorder(tempNode.rightChild);
        }
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
        rootNode = deleteNodeRecur(rootNode,value);
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

    static int prev = Integer.MIN_VALUE;
    public static Boolean isBST(BinaryTree bt){
        return isBST(bt.rootNode);
    }
    private static Boolean isBST(BinaryTreeNode tempNode){
        if(tempNode==null){
            return true;
        }

        if(!isBST(tempNode.leftChild)){
            return false;
        }
        if(tempNode.data <=prev){
            return false;
        }
        prev = tempNode.data;
        return isBST(tempNode.rightChild);
    }
}

class Test{
    public static void main(String[] args) {
        BST t1 = new BST();
        t1.insertNode(20);
        t1.insertNode(2);
        t1.insertNode(3);
        t1.insertNode(1);
        t1.insertNode(-2);
//        t1.insertNode(16);
//        t1.insertNode(22);
//        t1.insertNode(26);
//        t1.insertNode(30);
//        t1.insertNode(29);
//        t1.insertNode(32);

        System.out.print("t1 inorder is - ");
        t1.Traversal_inorder();

//        System.out.print("t1 preorder is - ");
//        t1.Traversal_preorder();
//        System.out.println();

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
        t1.Traversal_inorder();
//        t1.deleteNode(16);
//        t1.Traversal_inorder();
//        t1.deleteNode(25);
//        t1.Traversal_inorder();

//        t1.deleteNode(4); // 4 is not in tree, will thorw value not found error

//        BST t2 = new BST();
//        t2.deleteNode(2); // as its an empty tree error will be thrown.
    }
}
