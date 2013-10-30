import java.rmi.*;
import java.rmi.server.*;

public class JobQueueImpl extends UnicastRemoteObject 
			implements JobQueue {

	public JobQueueImpl() throws RemoteException {
		super();
		try {
			Naming.bind("rmi:///JobQueue", this);
			System.out.println("Server Ready");
		} catch (Exception e){
			System.err.println("Failed to start RMI server: "
				+ e.getMessage());
		}
	}

	//The method that will be invoked remotely by clients
	public Job getJob(){
		return new Job();
	}

	public static void main(String[] args){
		try {
			new JobQueueImpl();
		} catch (RemoteException e){
			System.err.println("Failed to start RMI server: "
				+ e.getMessage());
		}
	}
}
