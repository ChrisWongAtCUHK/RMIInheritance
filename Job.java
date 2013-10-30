public class Job implements java.io.Serializable{
	String msg;
	public Job(){
		//Just to distinguish one job from the next
		msg = Long.toString(System.currentTimeMillis());
	}
	public void process(){
		//Put complex algorithm here
		System.out.println("Job generated on server at: "+msg);
	}
}
