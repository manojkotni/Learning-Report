package collections;

import java.util.HashSet;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		 hs.add(5);
		 hs.add(4);
		 hs.add(6);
		 hs.add(6);
		 hs.add(66);
		
		 for(Integer num :hs) {
			 System.out.println(hs.size());
			 
		 }
		
	}

}
