package Collection;

import java.io.File;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
	
	public static void main(String[] args){
			/*int[] data=new int[]{1,3,2,5,7};
			int result=search(data,1);
			System.out.println(result);*/

		File f=new File("F:\\scalaes\\Scalaes\\Scala");
		getFile(f);
		
		//get();
	}
/*
 *二分法
			public static int search(int[] data,int a){
					Arrays.sort(data);
					int middle;
					int end=data.length-1;
					int i=0;
					while(i<=end){
						middle=(i+end)/2;
						if(data[middle]<a){
							i=middle+1;
						}else if(data[middle]==a){
							return middle;
						}else{
							end=middle-1;
						}
						
					}	
					return -1;
					
			}*/
	public static void get(){
		String s1="1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";
		String s2="2,5,6";
		int number=3;
		String[] str=s1.split(",");
		String[] str2=s2.split(",");
		
		Random r=new Random();
		HashSet<Integer> h=new HashSet<Integer>();
		StringBuffer sb=new StringBuffer();
		List list=new ArrayList<Integer>();
		for (String strs : str2) {
			list.add(Integer.valueOf(strs));
		}
		
		for (int i = 0; i <number; i++) {
			
			int rannum=r.nextInt(16);
			if(h.size()>=3){
				break;
			}else if(rannum==0||i==number){		
				number++;
				continue;
			}else if((list.contains(rannum)||i==number)||h.contains(rannum)){
				number++;
				continue;
			}else{
				sb.append(rannum+",");
				h.add(rannum);
			}
		}
		System.out.println(sb.toString());	
	}		
	public static void getFile(File file){
			
		if(file.isDirectory()){
			File[] f=file.listFiles();
			for (File file2 : f) {
					if(file2.isDirectory()){
						getFile(file2);
					}else{
						System.out.println(file2.getAbsolutePath()+"-----"+new SimpleDateFormat("yyyy-MM-dd").format(file.lastModified()));
					}
			}
		}else{
			System.out.println(file.getAbsolutePath()+"----"+new SimpleDateFormat("yyyy-MM-dd").format(file.lastModified()));
		}
		
	}
		
	
	
	
	
	
}
