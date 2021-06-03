/*
Exercise 10 - Self-Checkout

Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints

    Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
    Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges

    Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
    Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
*/

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);

        int Subtotal = 0;

        System.out.print("Enter the price of item 1: ");
        int price1 = Integer.parseInt(cursor.nextLine());
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = Integer.parseInt(cursor.nextLine());
        Subtotal += price1 * quantity1;

        System.out.print("Enter the price of item 2: ");
        int price2 = Integer.parseInt(cursor.nextLine());
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = Integer.parseInt(cursor.nextLine());
        Subtotal += price2 * quantity2;

        System.out.print("Enter the price of item 3: ");
        int price3 = Integer.parseInt(cursor.nextLine());
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = Integer.parseInt(cursor.nextLine());
        Subtotal += price3 * quantity3;

        double Tax = Subtotal * .055;
        double Total = Subtotal + Tax;

        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Tax: $" + Tax);
        System.out.println("Total: $" + Total);
    }
}
