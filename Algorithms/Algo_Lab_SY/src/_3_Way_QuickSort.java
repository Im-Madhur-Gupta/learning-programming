import java.util.Random;
class _3_Way_QuickSort {
    public static void threeWayQuickSort(int arr[], int start, int end) {
        if (start > end) { // Base Condition
            return;
        }
        // 3-Way Sorting
        int l = start;
        int h = end;
        int i = start + 1;
        while (i <= h) {
            if (arr[i] < arr[l]) {
                swap(arr, i++, l++);
            } else if (arr[i] > arr[l]) {
                swap(arr, i, h--);
            } else {
                i++;
            }
        }
        // Recursive calls to sort leftout part of array
        threeWayQuickSort(arr, start, l - 1);
        threeWayQuickSort(arr, h + 1, end);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(12) + 1;
        }
        threeWayQuickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
