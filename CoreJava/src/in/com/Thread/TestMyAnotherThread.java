package in.com.Thread;

public class TestMyAnotherThread {
public static void main(String[] args) {
	MyThread my=new MyThread();
	Thread tr=new Thread(my);
	
	MyAnotherThread m1=new MyAnotherThread();
	
	tr.start();
	m1.start();
}
}
