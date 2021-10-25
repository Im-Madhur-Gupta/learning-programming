class Demo1 {
    public int myMethod(int num1, int num2) {
        System.out.println("First myMethod of class Demo");
        return num1 + num2;
    }

    public int myMethod(long var1, long var2) {
        System.out.println("Second myMethod of class Demo");
        return (int)(var1 - var2);
    }
}

class Demo2 {
    public static void main(String args[]) {
        Demo1 obj2 = new Demo1();
//        obj2.myMethod(10, 10); --> commented out just for the time being
//        obj2.myMethod(20, 12);
        System.out.println(obj2.myMethod(10, 10));
        System.out.println(obj2.myMethod((long)20, (long)12));
    }
}
