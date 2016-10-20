import java.util.Scanner;

public class runableSandbox implements Runnable {

    public void run() {
    	System.out.println("start");
    	try {
    	    Thread.sleep(5000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	try {
    		System.out.println("mid");
    	    Thread.sleep(5000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
    	 (new Thread(new runableSandbox())).start();
    	Scanner user_input = new Scanner( System.in );
		String word;
		System.out.print("Type Apples: ");
	      word = user_input.next( );
	    System.out.println(word);
        //(new Thread(new runableSandbox())).start();
    }

}