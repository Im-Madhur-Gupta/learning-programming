class NodeBT {
    int data;
    NodeBT left, right;
}

class MainDiameterBT {
    static NodeBT newNode(int data) {
        NodeBT node = new NodeBT();
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }

    public static void main(String[] args) {
        NodeBT root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println(DiameterBT.getDiameter(root));
    }
}

// Diameter of BT - Number of nodes in the longest path between 2 leaf nodes of the tree.
// Note - The diameter path may not contain the root.
// TC - O(n), SC - O(n)
// Approach -
// - The diameter of the whole BT is the max of no. of nodes in the longest path b/w 2 leaf nodes
//   considering ith node as root such that ith node lies in the path.
// - In simple words --> max((1+lh+rh) for all nodes).
// - Recursively calculate the lheight and rheight, and in each recursion compute & store the max of
//   (1+lh+rh) in a global var.
public class DiameterBT {
    // variable to hold the diameter of the BT
    static int diameter = 0;

    public static int getDiameter(NodeBT root) {
        getHeight(root);
        return diameter;
    }

    public static int getHeight(NodeBT node) {
        if (node == null) return 0;

        int lHeight = getHeight(node.left);
        int rHeight = getHeight(node.right);

        diameter = Math.max(diameter, lHeight + rHeight + 1);

        return 1 + Math.max(lHeight, rHeight);
    }
}