import java.util.Scanner;
import java.util.HashMap;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed currency rates
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.92);
        rates.put("INR", 82.5);
        rates.put("GBP", 0.81);

        System.out.println("Available currencies: USD, EUR, INR, GBP");

        // Base currency
        System.out.print("Enter base currency: ");
        String base = sc.nextLine().toUpperCase();

        // Target currency
        System.out.print("Enter target currency: ");
        String target = sc.nextLine().toUpperCase();

        // Amount input
        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        if(rates.containsKey(base) && rates.containsKey(target)){
            double converted = amount / rates.get(base) * rates.get(target);
            System.out.println(amount + " " + base + " = " + converted + " " + target);
        } else {
            System.out.println("Invalid currency selection.");
        }

        sc.close();
    }
}