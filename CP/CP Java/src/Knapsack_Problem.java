import java.util.Scanner;

public class Knapsack_Problem {
    public static int knapSackBrute(int n, int W, int weights[], int costs[]) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if(weights[n-1]>W){
            return knapSackBrute(n-1,W,weights,costs);
        }
        else{
            return Math.max(costs[n-1] + knapSackBrute(n-1,W-weights[n-1],weights,costs),knapSackBrute(n-1,W,weights,costs));
        }
    }
    public static int knapSackDP(int n, int W, int weights[], int costs[]) {
        int answers[][] = new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(i==0 || w==0){
                    answers[i][w] = 0;
                }
                else if(weights[i-1]>w){
                    answers[i][w] = answers[i-1][w];
                }
                else{
                    answers[i][w] = Math.max(costs[i-1] + answers[i-1][w-weights[i-1]],answers[i-1][w]);
                }
            }
        }
        return answers[n][W];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, W;
        System.out.print("Enter the number of items: ");
        n = obj.nextInt();
        System.out.print("Enter the maximum weight of knapsack: ");
        W = obj.nextInt();
        int weights[] = new int[n];
        int costs[] = new int[n];
        System.out.println("Enter space separated weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = obj.nextInt();
        }
        System.out.println("Enter space separated costs:");
        for (int i = 0; i < n; i++) {
            costs[i] = obj.nextInt();
        }

        System.out.println("Maximum cost is: "+knapSackBrute(n,W,weights,costs));
        System.out.println("Maximum cost is: "+knapSackDP(n,W,weights,costs));
    }
}
