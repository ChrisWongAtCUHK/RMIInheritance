/* 
 * This class would be used to perform some sort of matrix manipulation. 
 * It is based on Job.java so 
 * it does not need to explicitly implement Serializable to be passed as an argument in a remote method invocation. 
 */

public class Matrix extends Job {
	public void process(){
		System.out.println("Would be processing a matrix");
	}
}
