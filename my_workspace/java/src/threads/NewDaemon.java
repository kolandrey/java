package threads;

public class NewDaemon implements Runnable {

	public NewDaemon(String string) {
		System.out.println(string);
	}

	@Override
	public void run() {
		for (int i = 200; i > 100; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Поток прерван");
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" end");
	}

}