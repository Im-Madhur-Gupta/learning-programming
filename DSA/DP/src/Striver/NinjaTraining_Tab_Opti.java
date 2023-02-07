package Striver;

public class NinjaTraining_Tab_Opti {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int prev[] = { points[0][0], points[0][1], points[0][2] };

        for (int day = 1; day < n; day++) {
            int maxPoints_0 = points[day][0] + Math.max(prev[1], prev[2]);
            int maxPoints_1 = points[day][1] + Math.max(prev[0], prev[2]);
            int maxPoints_2 = points[day][2] + Math.max(prev[0], prev[1]);

            prev[0] = maxPoints_0;
            prev[1] = maxPoints_1;
            prev[2] = maxPoints_2;
        }

        return Math.max(prev[0], Math.max(prev[1], prev[2]));
    }
}