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


    public static void main(String[] args) {

    }
}
