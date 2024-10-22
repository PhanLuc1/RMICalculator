import java.rmi.Remote;
import java.rmi.RemoteException;

// create interface include some calculator of remote server
public interface Calculator extends Remote {
    public int add(int a, int b) throws RemoteException;
    public int div(int a, int b) throws RemoteException;
}
