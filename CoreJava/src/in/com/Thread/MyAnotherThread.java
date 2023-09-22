package in.com.Thread;

public class MyAnotherThread extends Thread{
@Override
public void run() {
	for (int i = 10; i >=1; i--) {
		System.out.println("myanotherthread value"+i);
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
}
