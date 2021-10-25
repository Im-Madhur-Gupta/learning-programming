import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class Lucky_Integers_Slow {
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

    public static String solnSlow(long n, long k, long y) {
        List<Long> arr = recamanSeq(n);
        List<long[]> arr_temp = new ArrayList<>();
        for (long i = 0L; i < arr.size(); i++) {
            for (long j = i - k; j <= i + k; j++) {
                if (j == i || j < 0L || j >= arr.size()) {
                    continue;
                }
                arr_temp.add(new long[]{arr.get((int) i), arr.get((int) j), -1});
            }
        }
        String ans = "-1";
        long min = Integer.MAX_VALUE;
        for (long l = 0L; l < arr_temp.size(); l++) {
            for (long c : arr) {
                long a = arr_temp.get((int) l)[0];
                long b = arr_temp.get((int) l)[1];
                if (a * b + c == y && min > a * b) {
                    min = a * b;
                    ans = a + " " + b + " " + c;
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
            System.out.println(solnSlow(n, k, y));
        }
    }
}
