package Collection;

public class Test1 extends Thread{
	
	@Override
	public void run() {
		for (int i=0; i < 10000000; i++) {
			//System.out.println(Thread.currentThread().getName()+"-----="+i);
		}
	}
}
