public interface JobQueue extends java.rmi.Remote{
	//Get the next job on the queue
	Job getJob() throws java.rmi.RemoteException;
}
