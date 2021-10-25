public class Exercise_Swap_Nums {
    int a;
    int b;

    public void swap() {
        this.a = this.a + this.b;
        this.b = this.a - this.b;
        this.a = this.a - this.b;
    }

    public static void main(String[] args) {
//        int a = 2, b = 3;
//        swap(a, b); --> won't work.
//        System.out.println(a + " " + b);

//        Wrapper class laga ke karenge to bhi ni hoga.

//        int arr[] = {a,b};
//        swap(arr); // --> isse array ke elements swap ho jaenge.
//        System.out.println(arr[0] + " " + arr[1]);

//        ****************** Best Method to swap numbers in Java ************************
        Exercise_Swap_Nums obj = new Exercise_Swap_Nums();
        obj.a = 2;
        obj.b = 3;
        obj.swap();
        System.out.println(obj.a+" "+obj.b);
    }

//    Isse swap ni hoga obvs. bcz java me primitive datatypes are called by VALUE and NOT Reference.
//    public static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }

//    as Array is a non-primitive datatype in Java its call is by REFERECE, so, actual array can be altered.
//    public static void swap(int arr[]) {
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//    }
}