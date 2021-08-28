import java.util.PriorityQueue;
import java.util.Comparator;

// GOG - https://www.geeksforgeeks.org/huffman-coding-greedy-algo-3/
class HuffmanNode {
    int freq;
    char c;
    HuffmanNode lc;
    HuffmanNode rc;
}

// Mai ek comparator class bana raha hu meri min priority queue ke liye jisse wo min element compare karke nikal paye.
class Comparator_HuffmanNode implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode n1, HuffmanNode n2) {
        return n1.freq - n2.freq; // min freq element pata lagane ke liye
    }
}

public class Huffman_Encoding_Decoding {
    public static void printCodes(HuffmanNode root) {
        printCodes(root, "");
    }

    private static void printCodes(HuffmanNode root, String s) {
        // Ye function Huffmann Tree ke corresponding jo jo characters he unka variable length code print kardega.
        // Huffmann Tree me jo actual characters he wo sare ke sare Leaf nodes hote he.
        // IMP - Huffmann Tree me yato koi node Leaf node he ya phir uske pure-pure 2 children he.
        if (root.lc == null && root.rc == null && Character.isLetter(root.c)) {
            // Agr ye leaf he aur iska character valid he alphabet he
            System.out.println(root.c + " : " + s);
            return;
        }
        printCodes(root.lc, s + "0");
        printCodes(root.rc, s + "1");
    }

    public static String Huffmann_Decoding(HuffmanNode root, String code) {
        HuffmanNode tempNode = root;
        StringBuffer tempString = new StringBuffer();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') { // Right
                tempNode = tempNode.rc;
            }
            else { // Left
                tempNode = tempNode.lc;
            }
            if(tempNode.lc==null && tempNode.rc==null){
                tempString.append(tempNode.c);
                tempNode=root;
            }
        }
        return new String(tempString);
    }

    public static void main(String[] args) {
        int n = 5;
        char charArray[] = {'a', 'b', 'c', 'd', 'e'};
        int charfreq[] = {4, 8, 12, 14, 16, 50};

        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new Comparator_HuffmanNode());
        // Min aur Max priority queue me Comparator me change ayega declaration and initialization is exactly same.
        // Comparator samjhne ke liye Web dev JS - List sort() method ke andar jo compare karne ke liye maine method
        // deta hu usse dekho.

        for (int i = 0; i < n; i++) {
            HuffmanNode tempNode = new HuffmanNode();
            tempNode.freq = charfreq[i];
            tempNode.c = charArray[i];
            q.add(tempNode);
        }

        HuffmanNode rootFinal = null; // ye node resulting Huffmann tree ka root rahega

        while (q.size() > 1) { // mai tab tak ye loop chalwana chahta hu jab tak mera priority queue me 1 element na bache
            HuffmanNode L = q.poll();
            HuffmanNode R = q.poll();
            HuffmanNode tempNode = new HuffmanNode();
            tempNode.freq = L.freq + R.freq;
            tempNode.c = '*';
            tempNode.lc = L;
            tempNode.rc = R;
            q.add(tempNode);
            rootFinal = tempNode; // ye kara kyoki mai final iteration me jo temp node bane usko rootFinal karna chahta
            // hu bcz it would be the only element in the min priority queue and it would be the root Node of the
            // required Huffmann Tree.
        }
        // Printing codes corresponding to the characters in our Huffmann Tree
        printCodes(rootFinal);

        // Decoding -
        System.out.println(Huffmann_Decoding(rootFinal,"00010011"));
    }
}
