import java.util.Scanner;

class Ingredient {
    int exp_date; // a simple natural number
    String name;
    boolean isExpired = false;

    public Ingredient(int exp_date, String name) {
        this.exp_date = exp_date;
        this.name = name;
    }
}

public class Sort_Expiry_Dates {
    public static double sortIngredients(Ingredient items[], int current_date) {
        // Insertion Sort is used for sorting purpose.
        long start = System.nanoTime();
        Ingredient toBeInserted;
        int m;
        for (int i = 0; i < items.length; i++) {
            if (items[i].exp_date < current_date) {
                items[i].isExpired = true;
            }
            toBeInserted = items[i];
            for (m = i - 1; m >= 0 && items[m].exp_date > toBeInserted.exp_date; m--) {
                items[m + 1] = items[m];
            }
            items[m + 1] = toBeInserted;
        }
        long end = System.nanoTime();
        return (end - start) / 1000.0; // converting time to microsec and returning it
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Number of ingredients to be Sorted and Checked - ");
        int num_items = obj.nextInt();
        Ingredient items[] = new Ingredient[num_items];
        String name_temp;
        int current_date, exp_dte_temp;
        for (int i = 0; i < num_items; i++) {
            System.out.print("Enter Name of ingredient " + (i + 1) + " - ");
            obj.nextLine(); // to remove extra '\n' from input stream.
            name_temp = obj.nextLine();
            System.out.print("Enter Expiry Date of ingredient " + (i + 1) + " - ");
            exp_dte_temp = obj.nextInt();
            System.out.println();
            items[i] = new Ingredient(exp_dte_temp, name_temp);
        }
        System.out.print("Enter Current Date - ");
        current_date = obj.nextInt();

        // Sorting the ingredients -
        double runtime = sortIngredients(items, current_date);

        System.out.println("\nSorted sequence of ingredients according to their expiry dates, with expired ones removed is as follows -");
        for (Ingredient j : items) {
            if (j.isExpired == false) {
                System.out.println(j.name + " - " + j.exp_date);
            } else {
                System.out.println(j.name + " - " + j.exp_date + " - EXPIRED");
            }
        }
        System.out.println("\nRuntime - " + runtime);

    }
}
