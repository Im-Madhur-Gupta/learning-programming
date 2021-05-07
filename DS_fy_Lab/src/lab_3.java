import java.util.concurrent.ThreadLocalRandom;
public class lab_3 {

    public static float bubble_sort(int case_type)
    {
        int num[] = new int[100];
        int swaps;
        for(int i=0;i<100;i++){
            num[i] = ThreadLocalRandom.current().nextInt(1000, 10000+1);
        }

        // for case_type = 0 numbers are to be left in random order
        if(case_type==1) // when numbers should be in ascending order prior to sorting
        {
            while(true)
            {
                swaps=0;
                for (int i=0;i<num.length-1;i++)
                {
                    if(num[i]>num[i+1])
                    {
                        num[i] = num[i] + num[i+1];
                        num[i+1] = num[i] - num[i+1];
                        num[i] = num[i] - num[i+1];
                        swaps++;
                    }
                }
                if(swaps==0)
                {
                    break;
                }
            }
        }
        else if(case_type==2) // when numbers should be in descending order prior to sorting
        {
            while(true)
            {
                swaps=0;
                for (int i=0;i<num.length-1;i++)
                {
                    if(num[i]<num[i+1])
                    {
                        num[i] = num[i] + num[i+1];
                        num[i+1] = num[i] - num[i+1];
                        num[i] = num[i] - num[i+1];
                        swaps++;
                    }
                }
                if(swaps==0)
                {
                    break;
                }
            }
        }

        // actual sorting starts
        long start = System.nanoTime();
        while(true)
        {
            swaps=0;
            for (int i=0;i<num.length-1;i++)
            {
                if(num[i]>num[i+1])
                {
                    num[i] = num[i] + num[i+1];
                    num[i+1] = num[i] - num[i+1];
                    num[i] = num[i] - num[i+1];
                    swaps++;
                }
            }
            if(swaps==0)
            {
                break;
            }
        }
        long end = System.nanoTime();
        return (end-start)/1000000.0f; // converting time to ms and returning it
    }

    public static float selection_sort(int case_type)
    {
        int num[] = new int[100];
        int swaps;
        for(int i=0;i<100;i++){
            num[i] = ThreadLocalRandom.current().nextInt(1000, 10000+1);
        }

        // for case_type = 0 numbers are to be left in random order
        if(case_type==1) // when numbers should be in ascending order prior to sorting
        {
            while(true)
            {
                swaps=0;
                for (int i=0;i<num.length-1;i++)
                {
                    if(num[i]>num[i+1])
                    {
                        num[i] = num[i] + num[i+1];
                        num[i+1] = num[i] - num[i+1];
                        num[i] = num[i] - num[i+1];
                        swaps++;
                    }
                }
                if(swaps==0)
                {
                    break;
                }
            }
        }
        else if(case_type==2) // when numbers should be in descending prior to sorting
        {
            while(true)
            {
                swaps=0;
                for (int i=0;i<num.length-1;i++)
                {
                    if(num[i]<num[i+1])
                    {
                        num[i] = num[i] + num[i+1];
                        num[i+1] = num[i] - num[i+1];
                        num[i] = num[i] - num[i+1];
                        swaps++;
                    }
                }
                if(swaps==0)
                {
                    break;
                }
            }
        }

        int min_index,temp;
        // actual sorting starts
        long start = System.nanoTime();
        for (int i=0;i<num.length-1;i++)
        {
            min_index=i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[min_index]>num[j])
                {
                    min_index=j;
                }
            }
            temp = num[min_index];
            num[min_index] = num[i];
            num[i] = temp;
        }
        long end = System.nanoTime();
        return (end-start)/1000000.0f; // converting time to ms and returning it
    }



    public static void main(String[] args) {

//        for sorting question -
//        // case_type is 0 for sorting when numbers are in random order
//        // case_type is 1 for sorting when numbers are in ascending order
//        // case_type is 2 for sorting when numbers are in descending order
//
//        // Following variables store the total time for the 3 case_types
//        // One set for bubble sort and other for selection sort
//        // I will divide their final value by 10 to get their average values.
//        float time_bubble_random=0.0f,time_bubble_ascending=0.0f,time_bubble_descending=0.0f;
//        float time_selection_random=0.0f,time_selection_ascending=0.0f,time_selection_descending=0.0f;
//
//        for(int j=1;j<=10;j++) // loop runs for 10 times
//        {
//            // For Bubble sort -
//            time_bubble_random += bubble_sort(0); // when numbers are in random order
//            time_bubble_ascending += bubble_sort(1); // when numbers are in ascending order
//            time_bubble_descending += bubble_sort(2); // when numbers are in descending order
//
//            // For Selection sort -
//            time_selection_random += selection_sort(0); // when numbers are in random order
//            time_selection_ascending += selection_sort(1); // when numbers are in ascending order
//            time_selection_descending += selection_sort(2); // when numbers are in descending order
//        }
//
//        System.out.println("The average times are as follows -");
//        // all the values are divided by 10 to take average and %.3f is used for 3 digit decimal precision
//        System.out.printf("Bubble sort -\nFor random order - %.3f\nFor ascending order - %.3f\nFor descending order - %.3f\n", time_bubble_random/10, time_bubble_ascending/10, time_bubble_descending/10);
//
//        System.out.printf("\nSelection sort -\nFor random order - %.3f\nFor ascending order - %.3f\nFor descending order - %.3f\n", time_selection_random/10, time_selection_ascending/10, time_selection_descending/10);



    }
}
