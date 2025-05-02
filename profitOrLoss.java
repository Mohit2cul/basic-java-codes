import java.util.Scanner;
public class profitOrLoss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();
        double profit = sellingPrice - costPrice;
        double loss = costPrice - sellingPrice;
        if(sellingPrice > costPrice) {
            System.out.println("Profit: " + profit);
        } else if(sellingPrice < costPrice) {
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}