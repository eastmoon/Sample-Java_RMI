import java.rmi.*;
import java.rmi.server.*;

public class AdditionServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Start Server");
			
			System.setSecurityManager(new RMISecurityManager());
			
			Addition hello = new Addition();
			
			Naming.rebind("rmi://localhost/ABC", hello);
			
			System.out.println("Addition Server is ready.");
		}catch( Exception e ){
			System.out.println("Addition Server failed: " + e);
		}
	}

}
