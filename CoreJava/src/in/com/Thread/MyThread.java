package in.com.Thread;

public class MyThread implements Runnable{
@Override
public void run() {
	for (int i=0;i<11;i++) {
		System.out.println("myThread value"+i);
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}

	
	
	
	
	
	
	
	
}
