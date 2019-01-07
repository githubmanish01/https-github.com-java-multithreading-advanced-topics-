package learning.java.concepts.multithreading.advancedtopics.threadgroups;

public class TestThreadGroups {

	public static void main(String[] args) {
		PoliciesThread policiesThread=new PoliciesThread();
		System.out.println("In main -- Thread Group = "+Thread.currentThread().getThreadGroup().getName()+" Parent thread group="+Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup policiesThreadGroup=new ThreadGroup("Policies ThreadGroup");
		Thread policiesThreadt=new Thread(policiesThreadGroup, policiesThread);
		policiesThreadt.start();
	}

}
