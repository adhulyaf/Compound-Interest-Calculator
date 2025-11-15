import java.util.*;

public class CI {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double principal;
       double rate;
       int timecompunded;
       int years;
       double amount;

       System.out.print("Enter the principal amount: ");
       principal = scanner.nextDouble();
       System.out.print("Enter the annual interest rate (in %): ");   
       rate = scanner.nextDouble()/100;
       System.out.print("Enter the number of times interest is compounded per year: ");
       timecompunded = scanner.nextInt();
       System.out.print("Enter the number of years the money is invested for: ");
       years = scanner.nextInt();

       amount = principal * Math.pow(1 + (rate / timecompunded), timecompunded * years);

       System.out.printf("The amount after %d years is: %.2f\n", years, amount);
       
    }
}