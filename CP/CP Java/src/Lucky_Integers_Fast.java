import java.util.*;

class Lucky_Integers_Fast {
    public static List<Long> recamanSeq(long m) {
        List<Long> a = new ArrayList<>();
        a.add(0L);
        Set<Long> used = new HashSet<>();
        used.add(0L);
        int n = 1;
        while (n < m) {
            long next = a.get(n - 1) - n;
            if (next < 1 || used.contains(next)) {
                next += 2 * n;
            }
            boolean alreadyUsed = used.contains(next);
            a.add(next);
            if (!alreadyUsed) {
                used.add(next);
            }
            n++;
        }
        return a;
    }

    public static String solnFast(long n, int k, int y) {
        List<Long> arr = recamanSeq(n);
        Set<Long> arr_hash_set = new HashSet<Long>(arr);
        long min = 1000000000000L;
        String ans = "-1";
        for (int i = 0; i < arr.size(); i++) {
            Deque<Long[]> subarr = new ArrayDeque<>((int) (2 * k));
            for (int j = i - k; j <= i + k; j++) {
                if (j == i || j < 0L || j >= arr.size()) {
                    continue;
                }
                subarr.addLast(new Long[]{arr.get(i), arr.get(j)});
            }
            while (!subarr.isEmpty()) {
                Long[] temp = subarr.removeFirst();
                if (arr_hash_set.contains(y - temp[0] * temp[1]) && min > temp[0] * temp[1]) {
                    min = temp[0] * temp[1];
                    if (temp[0] > temp[1]) {
                        ans = temp[1] + " " + temp[0] + " " + (y - temp[0] * temp[1]);
                    } else {
                        ans = temp[0] + " " + temp[1] + " " + (y - temp[0] * temp[1]);
                    }

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        for (int i = 0; i < t; i++) {
            int n = obj.nextInt(), k = obj.nextInt(), y = obj.nextInt();
            System.out.println(solnFast(n, k, y));
        }
    }
}
