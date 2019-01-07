package learning.java.concepts.multithreading.advancedtopics.threadgroups;

public class FRDIThread implements Runnable{

	@Override
	public void run() {
		System.out.println("FRDI Thread");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}

}
