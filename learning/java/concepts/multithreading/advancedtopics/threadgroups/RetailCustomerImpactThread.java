package learning.java.concepts.multithreading.advancedtopics.threadgroups;

public class RetailCustomerImpactThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Impact on Retail customer  due to FRDI");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}

}
