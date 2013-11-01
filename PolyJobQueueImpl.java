import java.rmi.*;
import java.rmi.server.*;

/*
 * This server is derived from the original JobQueueImpl class and re-uses the rmiregistry binding portion of the code. 
 * Main is re-written to make sure that an instance of this object is created instead of the old JobQueueImpl object. 
 * The getJob method is also modified to return the new types of Jobs. 
 */
public class PolyJobQueueImpl extends JobQueueImpl {
	int index = 1;
	Job[] list = { new Matrix() , new Prime() };

	public PolyJobQueueImpl() throws RemoteException {
		//JobQueueImpl takes care of the binding for us
		super();
	}
	
	//Polymorphically extend getJob to return the new Job types
	public Job getJob(){
		index = (index+1) % list.length; //Walk the index
		return list[index];
	}

	public static void main(String[] args){
		try {
			new PolyJobQueueImpl();
		} catch (RemoteException e){
			System.err.println("Failed to start RMI server: "
				+ e.getMessage());
		}
	}
}
