import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//server define some method to register RMI register
public class CalculatorImlp extends UnicastRemoteObject implements Calculator {

    protected CalculatorImlp() throws RemoteException {
        super();
    }

    @Override
    public int add(int a,int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int div(int a,int b) throws RemoteException {
        return a / b;
    }
}
