package Striver;

public class NinjaTraining_Recur {
    public static void main(String[] args) {
        int points[][] = { new int[] { 10, 50, 1 }, new int[] { 5, 100, 11 } };
        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        return getMaxPoints(points, n - 1, 3);
    }

    static int getMaxPoints(int points[][], int day, int lastAct) {
        if (day < 0) {
            return 0;
        }

        int maxPoints = -1;
        for (int currAct = 0; currAct < 3; currAct++) {
            if (currAct != lastAct) {
                maxPoints = Math.max(maxPoints, points[day][currAct] + getMaxPoints(points, day - 1, currAct));
            }
        }

        return maxPoints;
    }
}