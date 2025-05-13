package multithread;

public class MultiRunnable implements Runnable{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		int a=20;
		for(int i=0;i<a;i++)
		{
			Thread th=new Thread(new MultiRunnable());
			th.start();
		}

	}

}
