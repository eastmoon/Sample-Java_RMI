import java.rmi.*;
import java.rmi.server.*;

public class Addition extends UnicastRemoteObject 
		implements AdditionInterface {
	private int m_accumulator;
	
	public Addition() throws RemoteException {
	}
	
	public int Add(int a, int b) throws RemoteException {
		this.m_accumulator += a + b;
		System.out.println(this.m_accumulator);
		return this.m_accumulator;
	}
}
