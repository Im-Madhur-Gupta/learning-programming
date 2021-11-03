import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int n = sc.nextInt();
            ArrayList<String> s = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                s.add(sc.next());
            }
            Trie trie = new Trie();
            for (int i = 0; i < n; i++) {
                s.set(i, new StringBuilder(s.get(i)).reverse().toString());
                trie.insert(s.get(i));
            }
            System.out.println(trie.get() ? "Alice" : "Bob");
        }
        sc.close();
    }
}

class Trie {
    Node root;

    class Node {
        public Node[] nxt = new Node[26];
        boolean is_end;

        Node() {
            for (int i = 0; i < 26; i++) {
                nxt[i] = null;
            }
            is_end = false;
        }
    }

    Trie() {
        root = new Node();
    }

    void insert(String s) {
        Node curr = root;
        for (int i = 0; i < s.length(); i++) {
            if (curr.nxt[s.charAt(i) - 'a'] == null) {
                curr.nxt[s.charAt(i) - 'a'] = new Node();
            }
            curr = curr.nxt[s.charAt(i) - 'a'];
            curr.is_end = false;
        }
        curr.is_end = true;
    }

    boolean rec(Node curr) {
        int tot_Node = 0, win = 0;
        for (int i = 0; i < 26; i++) {
            if (curr.nxt[i] != null) {
                win += (rec(curr.nxt[i]) ? 1 : 0);
                tot_Node++;
            }
        }
        if (tot_Node == win)
            return false;
        else
            return true;
    }

    boolean get() {
        Node curr = root;
        return rec(curr);
    }
};
