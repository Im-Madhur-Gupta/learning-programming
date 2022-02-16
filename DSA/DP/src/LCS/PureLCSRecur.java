package LCS;

public class PureLCSRecur {
    static int pureLCSRecur(String X, int n, String Y, int m){
        // base condition
        if(n==0 || m==0) return 0;

        // choice diagram ke hisab se recursive calls karni he
        if(X.charAt(n-1)==Y.charAt(m-1)){
            // Agr dono strings ke last chars match ho rahe he to
            // simply baki ki dono strings ke liye recur call karni he
            // aur len of LCS mai +1 karna he.
            return 1+pureLCSRecur(X,n-1,Y,m-1);
        }
        else{
            // Agr last chars match ni ho rahe he to
            // 2 possibilities he
            // (n,m-1) aur (n-1,m) ke liye call karo jo max length de LCS ki wo rakhlo
            return Math.max(pureLCSRecur(X,n-1,Y,m),pureLCSRecur(X,n,Y,m-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(pureLCSRecur("abcdgh",6,"abedh",5));
        System.out.println(pureLCSRecur("abcdrh",6,"abedfhr",7));
    }
}
