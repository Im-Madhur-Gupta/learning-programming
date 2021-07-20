import java.util.concurrent.ThreadLocalRandom;
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
    private BinaryTreeNode rootNode;

    public void insertNode(int value){
        if(rootNode==null){
            rootNode = new BinaryTreeNode(value);
            return;
        }
        int rand;
        BinaryTreeNode tempNode=rootNode;
        while(tempNode.leftChild!=null && tempNode.rightChild!=null) {
            rand = ThreadLocalRandom.current().nextInt(0, 2);
            if (rand == 0) { // randomly selecting Left child for insertion
                tempNode = tempNode.leftChild;
            }
            else { // randomly selecting Right child for insertion
                tempNode = tempNode.rightChild;
            }
        }
        if(tempNode.leftChild==null){
            tempNode.leftChild = new BinaryTreeNode(value);
        }
        else{
            tempNode.rightChild = new BinaryTreeNode(value);
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
            preorderTraversal(tempNode.leftChild);
        }
        System.out.print(tempNode.data+", ");
        if(tempNode.rightChild!=null){
            preorderTraversal(tempNode.rightChild);
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
            preorderTraversal(tempNode.leftChild);
        }
        if(tempNode.rightChild!=null){
            preorderTraversal(tempNode.rightChild);
        }
        System.out.print(tempNode.data+", ");
    }
}

class Application1{
    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree();
        t1.insertNode(22);
        t1.insertNode(31);
        t1.insertNode(2);
        t1.insertNode(0);
        t1.insertNode(-5);
        t1.insertNode(1);
        t1.insertNode(13);
        t1.insertNode(7);
        t1.insertNode(1);
        t1.insertNode(100);
        t1.insertNode(-54);
        t1.insertNode(12);
        t1.insertNode(1);

        System.out.print("Preorder Traversal of given Binary Tree is - ");
        t1.preorderTraversal();

        System.out.print("Inorder Traversal of given Binary Tree is - ");
        t1.inorderTraversal();

        System.out.print("Postorder Traversal of given Binary Tree is - ");
        t1.postorderTraversal();
    }
}

