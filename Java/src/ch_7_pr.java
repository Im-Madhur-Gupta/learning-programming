package com.company;

public class ch_7_pr {

    static void table(int n,int m) {
        for(int i=1;i<=m;i++) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }

    static void star_right(int row) {
        for(int i=1;i<=row;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void star_right_inv(int row) {
        for(int i=row;i>0;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static long natural_sum(int n)
    {
        if(n==1) {
            return 1;
        }
        else {
            return n+natural_sum(n-1);
        }
    }

    static double avg(int ...arr){
        int sum=0;
        for (int i:arr)
        {
            sum+=i;
        }
        return (double)sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3));
    }
}
