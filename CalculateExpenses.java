import java.util.Scanner;

public class CalculateExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        
        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        
        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double discount = 0;
        
        
        if (quantity > 50) {
            discount = 0.1; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05; // 5% discount
        }

      
        double totalExpenses = quantity * pricePerItem * (1 - discount);
        return totalExpenses;
    }
}