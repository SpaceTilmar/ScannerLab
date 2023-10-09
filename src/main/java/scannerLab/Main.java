package scannerLab;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner deliverable = new Scanner(System.in);
        System.out.println("What product do you want?");
        String product = deliverable.nextLine();
        switch (product){
            case "Rice":
            break;
            case "rice":
            break;
            default:
                System.out.println("Invalid product");
                System.exit(0);
        }
        System.out.println("How much do you want?");
        int qty = deliverable.nextInt();

        double price = 5.00;
        System.out.println("How far away from the store are you?");
        double miles = deliverable.nextDouble();

        double total = qty * price;

        double trueTotal = 0;

        if (miles <= 5.0) {
            trueTotal = total + 2.0;
        } else if (miles > 5.0 && miles <= 15) {
            trueTotal = total + 5.0;
        } else if (miles > 15.0 && miles <= 25.0) {
            trueTotal = total + 10.0;
        } else if (miles > 25.0 && miles <= 50.0) {
            trueTotal = total + 15.0;
        } else if (miles > 50.0) {
            trueTotal = total + 20.0;
        }
        String txt = String.format("Product\t\tQty\t\tPrice\t\tMiles\t\tTotal\n----\t\t----\t----\t\t----\t\t----\n%s\t\t%d\t\t%.2f\t\t%.2f\t\t%.2f",product,qty,price,miles,trueTotal);
        System.out.println(txt);
        System.out.println("Thank you for your order have a great day!");
    }
}