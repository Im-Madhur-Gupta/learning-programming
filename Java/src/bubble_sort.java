package com.company;
import java.util.*;
public class bubble_sort {
    public static void bubble_sort(int arr[]) {
        int swaps;
        while(true)
        {
            swaps=0;
            for (int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    arr[i] = arr[i] + arr[i+1];
                    arr[i+1] = arr[i] - arr[i+1];
                    arr[i] = arr[i] - arr[i+1];
                    swaps++;
                }
            }
            if(swaps==0)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int N = obj.nextInt();

        int arr[] = new int[N];
        for(int i=0;i<N;i++) {
            System.out.printf("Enter element %d : ",i+1);
            arr[i] = obj.nextInt();
        }

        bubble_sort(arr);
        System.out.println("Sorted array is as follows - ");
        for(int j=0;j<N;j++) {
            System.out.print(arr[j]+" ");
        }



    }
}
