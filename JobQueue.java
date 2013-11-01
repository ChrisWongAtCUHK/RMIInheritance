/* 
 * This interface represents the methods that may be remotely invoked on the server. 
 * Every RMI server must implement at least one interface that extends java.rmi.Remote. 
 */

public interface JobQueue extends java.rmi.Remote{
	//Get the next job on the queue
	Job getJob() throws java.rmi.RemoteException;
}
