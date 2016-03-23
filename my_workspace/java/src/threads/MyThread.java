package threads;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i < 200; i++) {
			System.out.println(i);
		}
	}
}