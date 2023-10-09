package scannerLab;
import java.util.Scanner;
public class Delivery {
    Scanner deliverable = new Scanner(System.in);
    private String product = deliverable.nextLine();
    private int qty = deliverable.nextInt();
    private double price = 5.0;
    private double miles = deliverable.nextDouble();
    private double total = qty * price;
    private double trueTotal = 0;
    public void calculateDistance() {
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
    }
    public void DeliveryOrder(){
        System.out.println("Product    Qty    Price    Miles    Total" + "\n" + "----    ----    ----    ----    ----" + "\n" + product + qty + price + miles + trueTotal);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliverable=" + deliverable +
                ", product='" + product + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", miles=" + miles +
                ", total=" + total +
                ", trueTotal=" + trueTotal +
                '}';
    }
}
