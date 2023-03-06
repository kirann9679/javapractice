package mythread;

public class threading extends Thread {
	public void run() {
		System.out.println("Thread running");
}
	public static void main(String[]args) {
		threading t=new threading();
		t.run();
		System.out.println("Main Thread running");
		System.out.println(t.currentThread().getName());
	}

}
