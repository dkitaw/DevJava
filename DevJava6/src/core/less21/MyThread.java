package core.less21;

public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			try {
				sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}