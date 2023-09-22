package in.com.Thread;

public class TestMyThread {
public static void main(String[] args) {
	MyThread t1 =new MyThread();
	Thread tr=new Thread(t1);
	
	tr.start();
}
}
