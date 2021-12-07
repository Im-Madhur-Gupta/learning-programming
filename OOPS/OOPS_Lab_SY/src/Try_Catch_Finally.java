public class Try_Catch_Finally {
    public static void main(String[] args) {
        try{
            // ArithmeticException
            int num=1/0;
            // ArrayIndexOutOfBoundsException
            int arr[] = new int[1];
            arr[2]=9;
        }
        catch (ArithmeticException e){
            System.out.println("Exception occured");
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("If exception is not handled then won't run.");
    }
}
