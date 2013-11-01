Reference
	http://www.itec.uni-klu.ac.at/~harald/ds2001/rmi/pattern/pattern2.html

javac Matrix.java
javac Prime.java
javac PolyJobQueueImpl.java
rmiregistry &
java -Djava.security.policy=java.policy PolyJobQueueImpl &
java -Djava.security.policy=java.policy Worker
java -Djava.security.policy=java.policy Worker


javac CallbackJobQueue.java 
javac CallbackWorker.java 
javac CallbackJobQueueImpl.java 
javac CallbackWorkerImpl.java 
rmic CallbackWorkerImpl 
rmic CallbackJobQueueImpl 
rmiregistry & 
java CallbackJobQueueImpl & 
java CallbackWorkerImpl 