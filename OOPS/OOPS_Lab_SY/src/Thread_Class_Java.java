class MyThread extends Thread {
    public void run() {
        System.out.println("A new thread has been started.");
    }

    public static void main(String args[]) {
        MyThread thread_obj = new MyThread();
        thread_obj.start();
    }
}