import java.rmi.*;

public class AdditionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionInterface hello;
		try {
		        System.setSecurityManager(new RMISecurityManager());
		        hello = (AdditionInterface)Naming.lookup("rmi://192.168.1.179/ABC");
		        //hello = (AdditionInterface)Naming.lookup("rmi://localhost/ABC");
		        int result = hello.Add(9,10);
		        System.out.println("Result is :"+result);

		}catch (Exception e){
			System.out.println("HelloClient exception: " + e);
		}
	}
}
