#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int l, k;
        cin >> l >> k;
        int arr[l+1] = {0};

        while (k--)
        {
            int p, h, q;
            char s;
            cin >> p >> h >> s;
            int m;
            
            int b = 3*p;
            if(b > l){
                m = (b-l+p-1)/p;
            }
            else{
                m = 0;
            }
            q = b-m*p;

            if (s == '+')
            {
                arr[p - 1] += h;
                if (q < l)
                {
                    arr[q] -= h;
                }
            }
            else
            {
                arr[p - 1] -= h;
                if (q < l)
                {
                    arr[q] += h;
                }
            }
        }
        int a = arr[0];
        int b= arr[0];
        ll ans = 0, rookie = 0;
        for (int i = 1; i < l; i++)
        {
            b+=arr[i];
            if (abs(a-b)>ans)
            {
                ans= abs(a-b);
            }
            a=b;

        }
        cout << ans << endl;
    }

    return 0;
}
