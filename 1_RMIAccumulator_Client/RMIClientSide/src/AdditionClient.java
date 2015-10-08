import java.rmi.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdditionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionInterface hello;
	    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String ipAddress = "";
        String ipMethod = "AccumulatorS";
        String rmiAddress = "";
		try {
		        System.setSecurityManager(new RMISecurityManager());
		        
		        System.out.println("Input IP Address");
		        ipAddress = console.readLine();
		        if( ipAddress.equals("") )
		        	ipAddress = "localhost";
		        rmiAddress = "rmi://" + ipAddress + "/" + ipMethod;
		        System.out.println(rmiAddress);
		        hello = (AdditionInterface)Naming.lookup(rmiAddress);		        
		        // Accumulate
		        for (int i = 0; i < 10; i++) {
		            //Print a message
		        	result = hello.Add(1, 2);
			        System.out.println(i + "_Result is :"+result);
		            //Pause for 1 seconds
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
		        }
		}catch (Exception e){
			System.out.println("HelloClient exception: " + e);
		}
	}
}
