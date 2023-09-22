package in.com.Thread;

public class BackgroundDaemon extends Thread{
	
	private String name=null;

	public BackgroundDaemon(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		
	while (true) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println(name);
		}
	}
}	
	
	


