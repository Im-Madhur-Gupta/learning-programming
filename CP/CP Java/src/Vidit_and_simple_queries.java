import java.util.*;

class Main1 {
    static int blk = 550;
    static int[] m = new int[200005];
    static int odd1, oddg1, even2, eveng2, cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                temp.add(a[i]);
            }
            //  Collections.sort(temp);
            Set<Integer> set = new HashSet<>(temp);
            temp.clear();
            temp.addAll(set);
            Collections.sort(temp);
            for (int i = 0; i < temp.size(); i++)
                m[i] = 0;
            for (int i = 0; i < n; i++)
                a[i] = Collections.binarySearch(temp, a[i]);

            Node qry[] = new Node[q];
            for (int i = 0; i < q; i++) {
                qry[i] = new Node();
                qry[i].l = sc.nextInt();
                qry[i].r = sc.nextInt();
                qry[i].k = sc.nextInt();
                qry[i].l--;
                qry[i].r--;
                qry[i].ind = i;
            }
            Arrays.sort(qry, new Comparator<Node>() {
                public int compare(Node a, Node b) {
                    //   if (a.l / blk != b.l / blk)
                    //     return (int)(a.l / blk - b.l / blk);
                    //   return (int)(a.r - b.r);
                    if (a.l / blk != b.l / blk)
                        return (int)(b.l / blk - a.l / blk);
                    return (int)(b.r - a.r);
                }
            });
            int lp = 0;
            int rp = -1;
            cnt = odd1 = oddg1 = even2 = eveng2 = 0;
            int[] ans = new int[q];
            for (int i = 0; i < q; i++) {
                int l = qry[i].l;
                int r = qry[i].r;
                while (lp < l) {
                    remove(a[lp]);
                    lp++;
                }
                while (l < lp) {
                    add(a[lp - 1]);
                    lp--;
                }
                while (rp < r) {
                    rp++;
                    add(a[rp]);
                }
                while (rp > r) {
                    remove(a[rp]);
                    rp--;
                }
                ans[qry[i].ind] = get(qry[i].k, r - l + 1);
            }
            for (int i = 0; i < q; i++)
                System.out.println(ans[i]);
        }
    }

    public static void add(int x) {
        if(m[x]<0){
            m[x]++;
            return;
        }
        if (m[x] == 0)
            odd1++;
        else if (m[x] == 1) {
            odd1--;
            even2++;
        } else if (m[x] == 2) {
            even2--;
            oddg1++;
        } else if (m[x] % 2 == 1) {
            oddg1--;
            eveng2++;
        } else {
            eveng2--;
            oddg1++;
        }
        m[x]++;
        if (m[x] % 2 == 1)
            cnt++;
        else
            cnt--;
    }

    static void remove(int x) {
        if(m[x]<=0){
            m[x]--;
            return;
        }
        if (m[x] == 1)
            odd1--;
        else if (m[x] == 2) {
            even2--;
            odd1++;
        } else if (m[x] == 3) {
            oddg1--;
            even2++;
        } else if (m[x] % 2 == 1) {
            oddg1--;
            eveng2++;
        } else {
            eveng2--;
            oddg1++;
        }
        m[x]--;
        if (m[x] % 2 == 1)
            cnt++;
        else
            cnt--;
    }

    static int get(int k,int len) {
        if ((Math.abs(cnt - k) & 1) != 0 || k > len)
            return -1;
        if (k == cnt)
            return 0;
        else if (k < cnt)
            return (cnt - k) / 2;
        else {
            int delta = k - cnt;
            if (delta <= 2 * (even2 + eveng2))
                return delta / 2;
            else
                return delta - eveng2 - even2;
        }
    }
}

class Node {
    int blk = 550;
    int l, r, k;
    int ind;
}