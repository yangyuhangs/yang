package Collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Animal extends Thread{

	public static void main(String[] args) {
			
	
		long begin=System.currentTimeMillis();
		/*new Test1().start();
		new Test2().start();
		new Animal().start();*/
		for (int i = 0; i <300000000; i++) {
			//System.out.println(Thread.currentThread().getName()+"-----="+i);
		}
		for (int i=0; i < 10000000; i++) {
			//System.out.println(Thread.currentThread().getName()+"-----="+i);
		}
		for (int i = 0; i < 20000000; i++) {
			//System.out.println(this.getName()+"-----"+i);
		}
		long end=System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+"----"+(end-begin));
	}
	
	@Override
	public void run() {
		List list=new ArrayList<Integer>();
		
	}
}
