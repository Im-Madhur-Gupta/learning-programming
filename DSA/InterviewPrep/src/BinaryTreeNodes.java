import java.util.*;

// Quick Note -
// - Level Order Traversal uses a queue, is iterative.
// - Preorder, Inorder, Postorder Traversals use a stack, is recursive.
class BinaryTreeNode{
    int val;
    BinaryTreeNode rightChild;
    BinaryTreeNode leftChild;

    public BinaryTreeNode(int val){
        this.val = val;
        this.leftChild = this.rightChild = null;
    }
}

// Note - Binary Tree can be empty
public class BinaryTreeNodes {
    BinaryTreeNode root;

    public BinaryTreeNodes(){
        this.root = null;
    }

    public BinaryTreeNodes(int rootVal){
        this.root = new BinaryTreeNode(rootVal);
    }

    // level order insertion
    // https://www.geeksforgeeks.org/insertion-in-a-binary-tree-in-level-order/?ref=lbp
    public void insert(int newVal){
        BinaryTreeNode newNode = new BinaryTreeNode(newVal);

        // if tree is empty
        if(this.root==null){
            this.root = newNode;
            return;
        }

        // traversing in level order and inserting when an empty place is found for the 1st time
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<BinaryTreeNode>();
        // adding the root node to the queue to init it
        nodeQueue.add(this.root);
        while(!nodeQueue.isEmpty()){
            // queuing an element from the queue
            BinaryTreeNode currNode = nodeQueue.remove();

            // checking if the left child exists
            if(currNode.leftChild==null){
                currNode.leftChild=newNode;
                break;
            }
            else{
                nodeQueue.add(currNode.leftChild);
            }

            // checking if the right child exists
            if(currNode.rightChild==null){
                currNode.rightChild=newNode;
                break;
            }
            else{
                nodeQueue.add(currNode.rightChild);
            }
        }
    }

    // delete a node and replace it with the deepest right-most node of the Bianry Tree
    // deepest right-most node -> one that comes at the last of the level order traversal
    public boolean remove(int nodeVal){
        if(this.root==null) return false;

        BinaryTreeNode delNode = null, parentNode = null;
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<BinaryTreeNode>();
        nodeQueue.add(this.root);
        while(!nodeQueue.isEmpty()){
            BinaryTreeNode currNode = nodeQueue.remove();

            if(currNode.val==nodeVal){
                delNode = currNode;
            }

            if(currNode.leftChild!=null){
                parentNode = currNode;
                nodeQueue.add(currNode.leftChild);
            }

            if(currNode.rightChild!=null){
                parentNode = currNode;
                nodeQueue.add(currNode.rightChild);
            }
        }

        if(delNode==null){
            // node not found
            return false;
        }

        boolean hasRightNode = parentNode.rightChild!=null;
        // placing the value of the right-most deepest node on the to be deleted node
        delNode.val = hasRightNode ? parentNode.rightChild.val : parentNode.leftChild.val;
        // removing the right-most deepest node
        if(hasRightNode){
            parentNode.rightChild = null;
        }
        else{
            parentNode.leftChild = null;
        }

        return true;
    }

    //  printing the tree in inorder traversal
    public void printInorder(){
        printInorder(this.root);
    }
    private static void printInorder(BinaryTreeNode currNode){
        // base condition
        if(currNode==null) return;

        printInorder(currNode.leftChild);
        // processing the currNode
        System.out.print(currNode.val+" - ");
        printInorder(currNode.rightChild);
    }

    // printing the tree in preorder traversal
    public void printPreorder(){
        printPreorder(this.root);
    }
    private static void printPreorder(BinaryTreeNode currNode){
        // base condition
        if(currNode==null) return;

        // processing the current node
        System.out.print(currNode.val+" - ");
        printPreorder(currNode.leftChild);
        printPreorder(currNode.rightChild);
    }

    // printing the tree in postorder traversal
    public void printPostorder(){
        printPostorder(this.root);
    }
    private static void printPostorder(BinaryTreeNode currNode){
        // base condition
        if(currNode==null) return;

        printPostorder(currNode.leftChild);
        printPostorder(currNode.rightChild);
        // processing the current node
        System.out.print(currNode.val+" - ");
    }

    // printing the tree in level order traversal
    public void printLevelOrder(){
        if(this.root==null) return;

        Queue<BinaryTreeNode> nodeQueue = new LinkedList<BinaryTreeNode>();
        nodeQueue.add(this.root);
        while(!nodeQueue.isEmpty()){
            BinaryTreeNode currNode = nodeQueue.remove();

            // processing the current node
            System.out.print(currNode.val+" - ");

            // adding the left child of the current node if it exists
            if(currNode.leftChild!=null){
                nodeQueue.add(currNode.leftChild);
            }

            // adding the right child of the current node if it exists
            if(currNode.rightChild!=null){
                nodeQueue.add(currNode.rightChild);
            }
        }
    }
}

class MainBTN{
    public static void main(String[] args){
        BinaryTreeNodes bt = new BinaryTreeNodes();
        bt.printInorder();

        // inserting elements in level order
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);

        System.out.println("Inorder traversal - ");
        bt.printInorder();

        System.out.println();

        System.out.println("Preorder traversal - ");
        bt.printPreorder();

        System.out.println();

        System.out.println("Postorder traversal - ");
        bt.printPostorder();

        System.out.println();

        System.out.println("Levelorder traversal - ");
        bt.printLevelOrder();

        bt.remove(1);
        System.out.println();

        System.out.println("Levelorder traversal - ");
        bt.printLevelOrder();

    }
}
