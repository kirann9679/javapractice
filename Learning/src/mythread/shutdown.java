package mythread;

public class shutdown extends Thread{
public void run() {
	System.out.println("shutdown Thread running");
}
public static void main(String[]args) {
	Runtime obj= Runtime.getRuntime();
	obj.addShutdownHook(new shutdown());
	System.out.println("Main sleeping");
	try {
		Thread.sleep(4000);
	}
	catch(Exception e) {
		
	}
}	
}
