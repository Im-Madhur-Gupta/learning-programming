import java.util.*;

class NodeBTR {
    int data;
    NodeBTR leftChild, rightChild;
    NodeBTR rightNode;
}

class MainSameLvlBT {
    static NodeBTR newNode(int data) {
        NodeBTR node = new NodeBTR();
        node.data = data;
        node.leftChild = null;
        node.rightChild = null;

        return (node);
    }

    public static void main(String[] args) {
        NodeBTR root = newNode(1);
        root.leftChild = newNode(2);
        root.rightChild = newNode(3);
        root.leftChild.leftChild = newNode(4);
        root.leftChild.rightChild = newNode(5);

        ConnectSameLvlNodes.connectLevelNodes(root);
        System.out.println(root.rightNode==null?"null":root.rightNode.data);
        System.out.println(root.leftChild.rightNode==null?"null":root.leftChild.rightNode.data);
        System.out.println(root.rightChild.rightNode==null?"null":root.rightChild.rightNode.data);
        System.out.println(root.leftChild.leftChild.rightNode==null?"null":root.leftChild.leftChild.rightNode.data);
        System.out.println(root.leftChild.rightChild.rightNode==null?"null":root.leftChild.rightChild.rightNode.data);
    }
}

public class ConnectSameLvlNodes {
    // Approach - Modified Level Order Traversal
    // TC - O(n), SC - O(n)
    static void connectLevelNodes(NodeBTR root) {
        // trivial case
        if (root == null) return;

        Queue<NodeBTR> nodeQueue = new LinkedList<NodeBTR>();
        nodeQueue.add(root);
        int size = 1; // the number of nodes left to be processed at the current level
        while (!nodeQueue.isEmpty() && size >= 0) {
            if (size == 0) size = nodeQueue.size(); // have atleast 1 more level to be processed

            NodeBTR currNode = nodeQueue.remove();
            NodeBTR rightNode = size == 1 ? null : nodeQueue.element();

            currNode.rightNode = rightNode;
            if (currNode.leftChild != null) nodeQueue.add(currNode.leftChild);
            if (currNode.rightChild != null) nodeQueue.add(currNode.rightChild);
            size--;
        }
    }
}
