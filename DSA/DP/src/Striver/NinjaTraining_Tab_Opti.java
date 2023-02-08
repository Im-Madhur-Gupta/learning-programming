package Striver;

public class NinjaTraining_Tab_Opti {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int prev[] = new int[3];
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);

        for (int day = 1; day < n; day++) {
            int maxPoints[] = new int[3];
            for (int currAct = 0; currAct < 3; currAct++) {
                maxPoints[currAct] = points[day][currAct] + prev[currAct];
            }
            prev[0] = Math.max(maxPoints[1], maxPoints[2]);
            prev[1] = Math.max(maxPoints[0], maxPoints[2]);
            prev[2] = Math.max(maxPoints[0], maxPoints[1]);
        }

        return Math.max(prev[0], Math.max(prev[1], prev[2]));
    }
}