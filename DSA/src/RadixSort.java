import java.lang.*;
public class RadixSort {
    public static void radix_sort_me(int arr[]){
        int largest = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        for(int exp=1;largest/exp!=0;exp*=10){
            int countingArr[] = new int[10];

            for (int i = 0; i < arr.length; i++) {
                countingArr[(int)((arr[i]/exp) % 10)]++;
            }

            for (int j = 1; j < countingArr.length; j++) {
                countingArr[j] += countingArr[j - 1];
            }
            int outarr[] = new int[arr.length];
            for (int k = arr.length - 1; k >= 0; k--) {
                outarr[countingArr[(int)((arr[k]/exp) % 10)] - 1] = arr[k];
                countingArr[(int)((arr[k]/exp) % 10)]--;
            }
            for (int l = 0; l < arr.length; l++) {
                arr[l] = outarr[l];
            }
        }
    }
    public static void main(String[] args) {
        int temparr[] = {1,1,4,6,7,3,5,4,1,2,8,10};
        radix_sort_me(temparr);

        for(int i:temparr){
            System.out.print(i+" ");
        }
    }
}
