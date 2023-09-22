package in.com.Thread;

public class TestBackgroundDeamon {
	
public static void main(String[] args) {
	BackgroundDaemon b1=new BackgroundDaemon("deamon thread");
	b1.setDaemon(true);
	b1.start();
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+"main");
	}
	
}

}
