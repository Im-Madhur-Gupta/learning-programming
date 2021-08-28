// Madhur Gupta (202051112)
class BinaryTreeNode {
    int data;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    public BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BinaryTree{
    public BinaryTreeNode rootNode;

    public void insertNode(int value){
        if(rootNode==null){
            rootNode = new BinaryTreeNode(value);
            return;
        }
        // Level Order insertion in a Binary Tree using a Queue.
        Queue<BinaryTreeNode> tempQueue = new QueueLL<BinaryTreeNode>();
        BinaryTreeNode tempNode;
        tempQueue.enqueue(rootNode);
        while(!tempQueue.isEmpty()){
            tempNode = tempQueue.dequeue();
            if(tempNode.leftChild==null){
                tempNode.leftChild = new BinaryTreeNode(value);
                break;
            }
            else{
                tempQueue.enqueue(tempNode.leftChild);
            }

            if(tempNode.rightChild==null){
                tempNode.rightChild = new BinaryTreeNode(value);
                break;
            }
            else{
                tempQueue.enqueue(tempNode.rightChild);
            }
        }
    }

    public void preorderTraversal(){
        if(rootNode==null){
            System.out.println("null");
            return;
        }
        preorderTraversal(rootNode);
        System.out.println("\n");
    }
    private void preorderTraversal(BinaryTreeNode tempNode){
        System.out.print(tempNode.data+", ");
        if(tempNode.leftChild!=null){
            preorderTraversal(tempNode.leftChild);
        }
        if(tempNode.rightChild!=null){
            preorderTraversal(tempNode.rightChild);
        }
    }

    public void inorderTraversal(){
        if(rootNode==null){
            System.out.println("null");
            return;
        }
        inorderTraversal(rootNode);
        System.out.println("\n");
    }
    private void inorderTraversal(BinaryTreeNode tempNode){
        if(tempNode.leftChild!=null){
            inorderTraversal(tempNode.leftChild);
        }
        System.out.print(tempNode.data+", ");
        if(tempNode.rightChild!=null){
            inorderTraversal(tempNode.rightChild);
        }
    }

    public void postorderTraversal(){
        if(rootNode==null){
            System.out.println("null");
            return;
        }
        postorderTraversal(rootNode);
        System.out.println("\n");
    }
    private void postorderTraversal(BinaryTreeNode tempNode){
        if(tempNode.leftChild!=null){
            postorderTraversal(tempNode.leftChild);
        }
        if(tempNode.rightChild!=null){
            postorderTraversal(tempNode.rightChild);
        }
        System.out.print(tempNode.data+", ");
    }
}

class Application1{
    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree();
        t1.insertNode(2);
        t1.insertNode(0);
        t1.insertNode(2);
        t1.insertNode(0);
        t1.insertNode(5);
        t1.insertNode(1);
        t1.insertNode(1);
        t1.insertNode(1);
        t1.insertNode(2);
        t1.insertNode(100);
        t1.insertNode(-54);
        t1.insertNode(12);
        t1.insertNode(1);
        t1.insertNode(-8);
        t1.insertNode(3);

        System.out.print("Preorder Traversal of given Binary Tree is - ");
        t1.preorderTraversal();

        System.out.print("Inorder Traversal of given Binary Tree is - ");
        t1.inorderTraversal();

        System.out.print("Postorder Traversal of given Binary Tree is - ");
        t1.postorderTraversal();
    }
}