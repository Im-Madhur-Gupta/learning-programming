import java.util.regex.Pattern;

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


    public static int find_substr(String str,String sub_str)
    {
        if(sub_str.length()>str.length())
        {
            return -1; // size of sub_str shouldn't be greater that size of str.
        }

        for(int i=0;i<(str.length()-sub_str.length()+1);i++)
        {
            for (int j=0;j<sub_str.length();j++)
            {
                if(str.charAt(i+j)==sub_str.charAt(j))
                {
                    if(j==(sub_str.length()-1))
                    {
                        return i; // returning the index of 1st occurrence of sub_str in str.
                    }
                }
                else
                {
                    break;
                }
            }
        }

        return -1; // for sub_str not found in str.
    }

    public static int count_0(int n)
    {
        if(n<=0)
        {
            return -1;
        }

        int num_of_2=0,num_of_5=0;
        int temp;
        for(int i=n;i>0;i--)
        {
            temp=i;
            while(true)
            {
                if(temp%2==0)
                {
                    num_of_2++;
                    temp /= 2;
                }
                else
                {
                    break;
                }
            }
            while(true)
            {
                if(temp%5==0)
                {
                    num_of_5++;
                    temp /= 5;
                }
                else
                {
                    break;
                }
            }

        }

        if(num_of_2>num_of_5)
        {
            return num_of_5;
        }
        else
        {
            return num_of_2;
        }
    }

    public static int ones_in_binary(String binary)
    {
        char arr[] = binary.toCharArray();
        int num_of_ones=0;
        for(char i:arr) // iterating through arr
        {
            if(i=='1')
            {
                num_of_ones++;
            }
        }
        return num_of_ones;
    }

    public static boolean email_validator(String email)
    {
        // creating a regular expression
        String regular_exp = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        // creating a pattern using the regular expresion
        Pattern pattern = Pattern.compile(regular_exp);

        if (email == null) {
            return false;
        }

        // matching given email with pattern
        return pattern.matcher(email).matches();
    }

    public static String rev_in_batch(String str,int batch)
    {
        char arr[] = str.toCharArray();
        char temp;
        for(int i=0;i+batch<=arr.length;i+=batch)
        {
            for(int j=0;j<(batch/2);j++)
            {
                temp = arr[i+j];
                arr[i+j] = arr[batch+i-1-j];
                arr[batch+i-1-j] = temp;
            }

        }

        String result="";
        for(char k:arr) {
            result += k;
        }
        return result;
    }

    public static boolean isomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++)
        {
            for(int j=i+1;j<str1.length();j++) {
                if((str1.charAt(i)==str1.charAt(j)&&str2.charAt(i)==str2.charAt(j)) || (str1.charAt(i)!=str1.charAt(j)&&str2.charAt(i)!=str2.charAt(j))) {

                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void inverted_pyrmd(int row)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++) {
                System.out.print("  ");
            }
            for(int k=0;k<(2*(row-i)-1);k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

    }
}
