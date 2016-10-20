import java.util.*;
public class SandboxThread extends Thread{
	public void run(){
		System.out.println("Thread name: "+Thread.currentThread().getName());
		try {
			 Thread.currentThread().sleep(10000);
			 }
			 catch (Exception e) {
			 e.printStackTrace();
			 }
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
	

public static void main(String[] args) {
	SandboxThread firstSandboxThread = new SandboxThread();
	firstSandboxThread.start();
	
}
}
