import java.util.Scanner;
public class lab_1
{
    public static void division(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Divisor can't be zero.");
        }
        else
        {
            System.out.printf("%d / %d = %f",a,b,(float)a / b);
        }
    }

    public static void gcd(int a,int b)
    {
        int gr_div = 1; // variable to store greatest divisor

        for(int i=1;i<=a && i<=b;i++)
        {
            if (a%i == 0 && b%i == 0)
            {
                gr_div = i;
            }
        }
        System.out.printf("Greatest Common Divisor of %d and %d is %d.",a,b,gr_div);
    }

    public static void lcm(int a,int b)
    {
        int least_mul; // variable to hold the lcm value
        int largest;

        if(a==0 || b==0) {
            System.out.println("LCM of 0 with any number is not defined.");
            return;
        }

        if(a>b) {
            largest = a;
        }
        else {
            largest = b;
        }

        for(int i=largest;;i++) // I have not mentioned condition here as I will exit the loop using break statement.
        {
            if(i%a == 0 && i%b ==0)
            {
                least_mul=i;
                break;
            }
        }

        System.out.println("LCM is "+least_mul);
    }

    public static void power(int a,int b)
    {
        int power=1,temp=b;
        // temp variable is used in the loop and not b itself as I wanted to use value of b while
        // printing (check below .printf)
        while(temp != 0) // an extra check for b=0 isn't required as I have initialized power=1.
        {
            power *= a;
            temp--;
        }

        System.out.printf("%d raised to the power %d is %d.",a,b,power);
    }

    public static void max(int arr[])
    {
        int largest=arr[0];

        for(int i=1;i<(arr.length-1);i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest integer is the entered array is "+largest);

    }

    public static void min(int arr[])
    {
        int smallest=arr[0];

        for(int i=1;i<(arr.length-1);i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest integer is the entered array is "+ smallest);

    }

    public static void abs(int a)
    {
        if(a<0)
        {
            System.out.println("The absolute value of the entered integer is : "+(-a));
        }
        else
        {
            System.out.println("The absolute value of the entered integer is : "+(a));
        }
    }

    public static void factorial(int a)
    // this method can calculate factorials of numbers upto 20, as long datatype can't hold any value larger than that.
    {
        long factorial = 1;
        // extra condition for 0 isn't required as factorial is initialized to 1.
        while(a!=0)
        {
            factorial *= a;
            a--;
        }

        System.out.println("Factorial of the entered number is : "+factorial);
    }

    public static void sum(int arr[])
    {
        int sum=0;

        for(int i=0;i<(arr.length);i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the integers of the entered array is "+ sum);

    }

    public static void sumOfDigits(int a)
    {
        int sum_of_dig=0;
        while(a!=0)
        {
            sum_of_dig += (a%10);
            a /= 10;
        }
        System.out.println("Sum of the digits of the entered number is : "+sum_of_dig);

    }

    public static void sqrt(int a)
    {
        if(a<0) {
            System.out.println("Square root of a negative integer is not a real number.");
            return;
        }
        double temp,sqrroot=a/2;
        do
        {
            temp=sqrroot;
            sqrroot=(temp+(a/temp))/2;
        }
        while((temp-sqrroot)!= 0);
        System.out.println("Square root of the given number is : "+sqrroot);

    }

    public static void isPrime(int a)
    {
        int factors=0;

        if(a==0 || a==1) // condition of a=1 or a=0
        {
            System.out.println("Entered number is not a Prime.");
            return;
        }

        for(int i=1;i<=a;i++) {
            if(a%i==0) {
                factors++;
            }
        }

        if(factors==2) {
            System.out.println("Entered number is a Prime");
        }
        else {
            System.out.println("Entered number is not a Prime.");
        }
    }

    public static void isLeapYear(int a)
    {
        if(a%400==0 || (a%100 != 0 && a%4==0)) {
            System.out.println("Entered year is a leap year.");
        }
        else {
            System.out.println("Entered year is not a leap year.");
        }
    }

    public static void isPalindrome(int a)
    {
        int temp=a,rev_num=0,r;
        while(a>0)
        {
            r=a%10;
            rev_num = (rev_num*10) + r;
            a /= 10;
        }
        if(temp==rev_num)
            System.out.println("The entered number is a Palindrome.");
        else
            System.out.println("The entered number is not a Palindrome.");
    }

    public static void isArmstrong(int a)
    {
        int num_of_dig=0,temp1=a,temp2=a;
        while(temp1!=0) {
            temp1 /= 10;
            num_of_dig++;
        }

        int armstrgn_num=0;
        while(temp2!=0) {
            //armstrgn_num += power(temp2%10,num_of_dig);
            temp2 /= 10;
        }

        if(a==armstrgn_num) {
            System.out.println("The given number is an Armstrong Number.");
        }
        else {
            System.out.println("The given number is not an Armstrong Number.");
        }
    }

    public static void ArithmeticSequenceSum(int a, int d, int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += (a+i*d);
        }
        System.out.println("Sum of the terms is "+sum);
    }

    public static void GeometricSequenceSum(int a, int d, int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
//            sum += (a*power(d,i));
        }
        System.out.println("Sum of the terms is "+sum);
    }



    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a=10,b=3;
        //division(a,b);

    }
}


