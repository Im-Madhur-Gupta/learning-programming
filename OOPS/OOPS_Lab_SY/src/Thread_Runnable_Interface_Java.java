class Thread1 implements Runnable {
    public void run() { // Defining the run() method
        System.out.println("A parallel thread has been started.");
    }

    public static void main(String args[]) {
        Thread1 thread_obj = new Thread1();
        Thread thread_obj_passed = new Thread(thread_obj);
        // passing created thread_obj to Thread class constructor to create an instance of Thread class.
        thread_obj_passed.start();
    }
}
