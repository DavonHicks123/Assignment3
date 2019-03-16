import java.util.ArrayList;
import java.util.Collections;

public class Assignment3 {
	public static void main(String[] args) {
	    ArrayList<Integer>list=new ArrayList<Integer>();
	    
			
			list.add(10);
			list.add(13);
			list.add(2);
			list.add(8);
			list.add(7);
			list.add(90);
			list.add(-1);
			list.add(2);
			list.add(4);
			list.add(5);
			System.out.println(list.toString());
			reverse4(list);
			System.out.println(list);
		}
		

		private static void reverse4(ArrayList<Integer> list) {
		  list.remove(0); list.add(3,10);
		  list.remove(0); list.add(2,13);
		  list.remove(0); list.add(1,2);
		  list.remove(8); list.add(4,2);
		  list.remove(7); list.add(5,-1);
		  list.remove(7); list.add(6,90);
		  list.remove(8); list.add(8,4);
		  
		
		}
}
