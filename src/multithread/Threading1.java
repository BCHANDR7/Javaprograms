package multithread;

public class Threading1 extends Thread{
	
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
			Threading1 th=new Threading1();
			th.start();
		}

	}

}
