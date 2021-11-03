import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class abhirace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        int x, y, w;


        int[] station = new int[n + 1];
        int dp[][] = new int[n + 1][c + 1];
        int[] racer = new int[k];


        ArrayList<ArrayList<ArrayList<Integer>>> g = new ArrayList<ArrayList<ArrayList<Integer>>>();

        for (int i = 0; i < n + 1; i++) {
            ArrayList<Integer> g3 = new ArrayList<Integer>();

            ArrayList<ArrayList<Integer>> g2 = new ArrayList<ArrayList<Integer>>();

            g2.add(g3);
            g.add(g2);
        }


        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                dp[i][j] = (int) 1e18;
            }
        }

        for (int i = 0; i < n + 1; i++) {
            station[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            w = sc.nextInt();
            ArrayList<Integer> p1 = new ArrayList<Integer>();
            p1.add(y);
            p1.add(w);
            g.get(x).add(p1);
            p1.set(0, y);
            g.get(y).add(p1);

        }

        for (int i = 0; i < k; i++) {
            racer[i] = sc.nextInt();
        }

        if (p > 0) {
            for (int i = 0; i < p; i++) {
                station[sc.nextInt()] = 1;
            }
        }

        ArrayList<Integer> queue_input = new ArrayList<Integer>();

        PriorityQueue<ArrayList<Integer>> q = new PriorityQueue<>(Comparator.comparing(o -> o.get(0)));

        queue_input.add(0);
        queue_input.add(0);
        queue_input.add(n);

        q.add(queue_input);

        int[] visited = new int[n + 1];
        for (int i = 0; i < n + 1; i++) visited[i] = 0;

        while (!q.isEmpty()) {
            ArrayList<Integer> output = q.poll();
            int cost = output.get(0);
            int curr_fuel = output.get(1);
            int node = output.get(2);

            if (visited[node] == 1) {
                continue;
            }

            visited[node] = 1;

            dp[node][curr_fuel] = cost;

            for (int j = curr_fuel; j < c + 1; j++) {
                dp[node][j] = Math.min(dp[node][j], dp[node][curr_fuel]);
            }

            if (station[node] == 1) {
                curr_fuel = 0;
            }

            ArrayList<ArrayList<Integer>> helper = new ArrayList<ArrayList<Integer>>();
            helper = g.get(node);


            for (ArrayList<Integer> helper2 : helper) {
                int child = helper2.get(0);
                int weight = helper2.get(1);
                if (curr_fuel + weight <= c && cost + weight < dp[child][curr_fuel + weight]) {

                    dp[child][curr_fuel + weight] = cost + weight;

                    queue_input.set(0, cost + weight);
                    queue_input.set(1, curr_fuel + weight);
                    queue_input.set(2, child);

                    q.add(queue_input);
                }
            }//for

        }//while

        int ans = (int) 1e18;

        for (int i : racer) {
            ans = Math.min(ans, dp[i][c]);
        }

        if (ans == 1e18) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }

        sc.close();


    }
}