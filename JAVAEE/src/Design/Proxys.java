package Design;

public class Proxys {
		
	public void buyproxy(){
		Zhenshi z=new Zhenshi();
		z.buy();
		
	}
	
	public void buyproxys(){
		System.out.println("买东西前先做额外的操作");
	}
	
}
