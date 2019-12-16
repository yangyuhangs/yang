package Collection;

import java.util.ArrayList;
import java.util.List;

public class Lanmda{
	
	public static void main(String[] args){
		System.out.println("1111111111111");
			List<String> list=new ArrayList<>();
			for (int i = 0; i < 100; i++) {
				new Thread(()->{
					list.add(Thread.currentThread().getName());
				}).start();
			}
			
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		
	}

}
