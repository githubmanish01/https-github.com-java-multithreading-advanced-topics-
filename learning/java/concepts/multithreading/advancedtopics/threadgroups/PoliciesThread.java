package learning.java.concepts.multithreading.advancedtopics.threadgroups;

public class PoliciesThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Parent of all policies");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		ThreadGroup namamiGangeThreadGroup=new ThreadGroup("Namami Gange Thread Group");
		NamamiGangeThread namamiGangeThread=new NamamiGangeThread();
		Thread namamiGangeThreadt=new Thread(namamiGangeThreadGroup,namamiGangeThread);
		namamiGangeThreadt.start();
	}

}
