import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

//Create server , register remote object with server, that's mean client can call remote method from server
public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Calculator calc = new CalculatorImlp();
            Naming.rebind("rmi://localhost:1099/CalculatorService", calc);
            System.out.println("Server sẵn sàng.");
        } catch (Exception e) {
            System.out.println("Lỗi server: " + e);
        }
    }
}
// server started