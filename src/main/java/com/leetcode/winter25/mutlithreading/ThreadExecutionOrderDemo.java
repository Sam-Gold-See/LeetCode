package mutlithreading;

import java.util.concurrent.CountDownLatch;

/**
 * T1、T2、T3三个线程确保三者严格顺序执行 (CountDownLatch)
 *
 * @author HuangChunXin
 * @date 2026/1/26 18:27
 */
public class ThreadExecutionOrderDemo {

	public static void main(String[] args) throws InterruptedException{
		CountDownLatch t1ToT2Latch = new CountDownLatch(1);
		CountDownLatch t2ToT3Latch = new CountDownLatch(1);

		Thread t1 = new Thread(() -> {
			System.out.println("T1 开始执行");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e ){
				e.printStackTrace();
			}
			System.out.println("T1 执行完毕");
			t1ToT2Latch.countDown();
		});

		Thread t2 = new Thread(() -> {
			try {
				t1ToT2Latch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("T2 开始执行");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e ){
				e.printStackTrace();
			}
			System.out.println("T2 执行完毕");
			t2ToT3Latch.countDown();
		});

		Thread t3 = new Thread(() -> {
			try {
				t2ToT3Latch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("T3 开始执行");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e ){
				e.printStackTrace();
			}
			System.out.println("T3 执行完毕");
		});

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("所有线程执行完毕");
	}
}
