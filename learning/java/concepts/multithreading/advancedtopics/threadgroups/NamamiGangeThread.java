package learning.java.concepts.multithreading.advancedtopics.threadgroups;

public class NamamiGangeThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Namami Gange thread");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println("Parent thread of Namami Gange thread ="+Thread.currentThread().getThreadGroup().getParent().getName());
	}

}
