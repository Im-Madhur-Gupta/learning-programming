import java.lang.Math;
class Solution {
    // My Solution - O(n) - Bad
    // public double myPow(double x, int n) {
    //     if (x == 0.0 || x == 1.0) return x;
    //     if(x==-1.0 && (long)n%2==0) return 1;
    //     if(x==-1.0 && (long)n%2!=0) return -1;
    //     if (n == 0) return 1;
    //     double ans = 1;
    //     // IMP: -2^(31) * -1 integer overflow kar raha he to mujhe
    //     // iss n ko long mai convert karke multiply karna padega.
    //     long absVal = n < 0 ? -1 * (long)n : n;
    //     for (int i = 0; i < absVal; i++) {
    //         if (n > 0) {
    //             ans *= x;
    //         } else {
    //             ans /= x;
    //         }
    //         // special check
    //         // if ans value becomes 1.0 or 0.0 then we can safely return ans
    //         if (ans == 0.0 || ans == 1.0) return ans;
    //     }
    //     return ans;
    // }

    // Best Soln - O(logn)
    // We will recursively calc pow = x^(n/2) and then the answer would pow * pow.
    public double myPow(double x, int n) {
        if (x == 0.0 || x == 1.0) return x;
        if(x==-1.0 && n%2==0) return 1;
        if(x==-1.0 && n%2!=0) return -1;
        return powRecur(x,n);
    }
    public static double powRecur(double x, int n){
        if (n == 0) return 1;
        double pow = powRecur(x,n/2);
        if(n>0 && n%2!=0){
            pow = pow * pow * x;
        }
        else if(n<0 && n%2!=0){
            pow = pow * pow * (1/x);
        }
        else{
            pow *= pow;
        }
        return pow;
    }
}