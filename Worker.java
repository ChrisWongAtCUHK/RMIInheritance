import java.rmi.*;

public class Worker {
	public Worker(){
		try {
			//Get a reference to the remote server
			JobQueue queue = (JobQueue)Naming.lookup(
				"rmi:///JobQueue");

			//Request a job from the remote server
			Job myJob = queue.getJob();

			//Start processing the Job.
			myJob.process();
		} catch(Exception e){
			System.err.println("Error connecting to server: "
				+e.getMessage());
		}
	}

	public static void main(String[] args){
		new Worker();
	}
}
