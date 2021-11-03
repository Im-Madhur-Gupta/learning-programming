import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int maxn = 100000;
        int k = 20;

        long[] logg = new long[maxn+1];


        long[][] st = new long[maxn][k+1];

        Scanner obj = new Scanner(System.in);
        // int t = obj.nextInt();

        logg[1] = 0;
        for (int i = 2; i <= maxn; i++)
            logg[i] = logg[i / 2] + 1;

        int n;

        // input an int
        n = obj.nextInt();


        long[] a = new long[n];


        long[] sum = new long[n+1];


        //convert the below cpp code to java


        sum[0] = 0;

        for (int i = 0; i < n; i++)
        {

            a[i] = obj.nextInt();

            sum[i + 1] = sum[i] + Math.abs(a[i]);

        }

        for(int i = 0; i < n; i++)
            st[i][0] =  Math.abs(a[i]);

        for (int j = 1; j <= k; j++)
            for (int i = 0; i + (1 << j) <= n; i++)
                st[i][j] = Math.min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);
        // st[i][j] = min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);

        // int neg_count[n + 1];
        int[] neg_count = new int[n+1];

        neg_count[0] = 0;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] < 0)
            {
                count++;
                neg_count[i + 1] = count;
            }
            else
                neg_count[i + 1] = count;
        }

        int q;
        // cin >> q;
        q = obj.nextInt();
        // cout<<"fwfw";

        for (int i = 0; i < q; i++)
        {
            int l, r;
            // cin >> l >> r;
            l = obj.nextInt();
            r = obj.nextInt();

            if (r == l)
            {
                // cout << a[r - 1] << endl;
                System.out.println(a[r - 1]);
            }
            else if (neg_count[r] - neg_count[l - 1] == r - l + 1 || neg_count[r] - neg_count[l - 1] == 0)
            {
                //   cout<<"sdbbb";
                // int j = logg[r - l + 1];
                int j =  (int)logg[r - l + 1];
                // int minimum = min(st[l - 1][j], st[(r - 1) - (1 << j) + 1][j]);
                long minimum = Math.min(st[l - 1][j], st[(r - 1) - (1 << j) + 1][j]);

                // cout << sum[r] - sum[l - 1] - 2 * minimum << endl;
                System.out.println(sum[r] - sum[l - 1] - 2 * minimum);
                // cout<<minimum<<endl;
            }
            else
            {
                // cout << sum[r] - sum[l - 1] << endl;
                System.out.println(sum[r] - sum[l - 1]);

            }
        }
    }
}
