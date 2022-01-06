class MyThread extends Thread {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    public void run() {
        try {
            System.out.println("Thread has been started.");
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            System.out.println("Sum is " + sum);
        }
        catch (Exception x){
            System.out.println("Exception encountered " + x);
        }
    }

    public static void main(String args[]) {
        MyThread thread_obj = new MyThread();
        thread_obj.start();

        try {
            Thread.sleep(100);
        }
        // catch block to handle the exception
        catch (Exception x) {
            System.out.println("Exception encountered " + x);
        }
    }
}