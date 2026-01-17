package com.leetcode.winter25.mutlithreading;

/**
 * 模仿购物系统，500张票，有4个购票窗口，模拟购票流程打印购票结果
 *
 * @author HuangChunXin
 * @date 2026/1/27 10:22
 */
public class TicketSystemDemo {

	private static final int TOTAL_TICKETS = 500;
	private static int remainingTickets = TOTAL_TICKETS;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		for (int i = 1;i<=4;i++) {
			new Thread(new TicketWindow(i)).start();
		}
	}

	static class TicketWindow implements Runnable {
		private int windowNumber;

		public TicketWindow(int windowNumber) {
			this.windowNumber = windowNumber;
		}

		private void buyTicket() {
			remainingTickets--;
			System.out.println("从窗口" + windowNumber + "购买1张票，剩余" + remainingTickets + "张票");
		}

		@Override
		public void run() {
			while (true) {
				synchronized (lock) {
					if (remainingTickets > 0) {
						buyTicket();
					} else {
						System.out.println("票已售完，窗口" + windowNumber + "关闭。");
						break;
					}
				}

				try {
					Thread.sleep((long) (Math.random() * 10));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
