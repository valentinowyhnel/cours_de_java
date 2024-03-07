import java.rmi.RMISecurityException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("deprecation")
public class MonServiceRPCServeur extends UnicastRemoteObject implements MonServiceRPCInterface {
    protected MonServiceRPCServeur() throws RMISecurityException, RemoteException {
        super();
    }

    @Override
    public int addition(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int multiplication(int a, int b) throws RemoteException {
        return a * b;
    }

    public static void main(String[] args) {
        // Code pour démarrer le serveur RMI ici
    }
}