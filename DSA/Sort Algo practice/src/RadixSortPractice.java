import java.lang.*;
import java.util.Arrays;

public class RadixSortPractice{
    public static void radix_sort_me(String arr[]){
        // numbers ke liye Right end Least significant, Left most significant, strings ke liye bhi yahi he (dictionary ordering).
            int countingArr[] = new int[26];
            for(int a=4;a>=0;a--){
                Arrays.fill(countingArr,0);
                for (int i = 0; i < 5; i++) {
                    countingArr[(int)arr[i].charAt(a)-97]++;
                }
                for (int j = 1; j < 26; j++) {
                    countingArr[j] += countingArr[j - 1];
                }
                String outarr[] = new String[5];
                for (int k = 4; k >= 0; k--) {
                    outarr[countingArr[(int)arr[k].charAt(a)-97] - 1] = arr[k];
                    countingArr[(int)arr[k].charAt(a)-97]--;
                }
                for (int l = 0; l < arr.length; l++) {
                    arr[l] = outarr[l];
                }
            }
    }
    public static void main(String[] args) {
        String temparr[] = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
        radix_sort_me(temparr);
        for(String i:temparr){
            System.out.print(i+"  ");
        }
    }
}
