package threads;

public class NewThread implements Runnable {

	public NewThread(String string) {
		System.out.println(string);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Поток прерван");
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" end");
	}

}
