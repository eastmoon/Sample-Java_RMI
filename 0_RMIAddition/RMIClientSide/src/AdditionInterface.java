import java.rmi.*;

public interface AdditionInterface extends Remote {
	public int Add(int a,int b) throws RemoteException;
}
