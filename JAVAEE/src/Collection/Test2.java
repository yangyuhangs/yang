package Collection;
public class Test2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 20000000; i++) {
			//System.out.println(this.getName()+"-----"+i);
		}
	}
}
