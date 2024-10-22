import java.rmi.Naming;
import java.util.Scanner;

// Create client find remote object, and use its
// now i'll run code
public class Client {
    public static void main(String[] args) {
        try {
            Calculator calc = (Calculator) Naming.lookup("rmi://localhost:1099/CalculatorService");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Add: " + calc.add(a, b));
            System.out.println("Div: " + calc.div(a, b));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
// run client
// client connected -> and now i'll calculator
// after that , client will close
// server is running , i still run client
// i will stop server
// client cannot run