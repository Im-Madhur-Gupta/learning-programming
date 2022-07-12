// IMP - I have used 0 based index for nodes.
// ith indexed node -
//      1. left child - (2*i)+1
//      2. right child - (2*i)+2

public class BinaryTreeArr {
    String treeArr[];

    public BinaryTreeArr(int capacity) {
        this.treeArr = new String[capacity];
    }

    public boolean addAtRoot(String newVal) {
        if (this.treeArr == null) return false;
        this.treeArr[0] = newVal;
        return true;
    }

    public boolean addRightChild(int parentIndex, String newVal) {
        if (this.treeArr == null || this.treeArr[parentIndex] == null) return false;
        this.treeArr[2 * parentIndex + 2] = newVal;
        return true;
    }

    public boolean addLeftChild(int parentIndex, String newVal) {
        if (this.treeArr == null || this.treeArr[parentIndex] == null) return false;
        this.treeArr[2 * parentIndex + 1] = newVal;
        return true;
    }

    public void printLevelOrder() {
        if (this.treeArr == null) return;

        for (int i = 0; i < this.treeArr.length; i++) {
            System.out.print((this.treeArr[i] == null ? "null" : this.treeArr[i]) + " - ");
        }

        System.out.println();
    }
}

class MainBTArr{
    public static void main(String[] args) {
        BinaryTreeArr bt = new BinaryTreeArr(5);
        bt.printLevelOrder();
        bt.addAtRoot("1");
        bt.addLeftChild(0,"2");
        bt.addRightChild(0,"3");
        bt.printLevelOrder();
    }
}