public class lab_2 {
    public static int rev_num(int num)
    {
        int rev=0,dig;
        while(num!=0)
        {
            dig = num%10;
            rev = (rev*10)+dig;
            num /= 10;
        }
        return rev;
    }

    public static String rem_dup(String str)
    {
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]='\0'; // replacing duplicate character with null character '\0'
                }
            }
        }

        String result = "";
        for (int k=0;k<arr.length;k++)
        {
            if(arr[k]=='\0')
            {
                continue;
            }
            result += arr[k];
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
