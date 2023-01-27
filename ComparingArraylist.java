package arraysutil;

import java.util.ArrayList;
import java.util.List;

public class ComparingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		 al.add("manoj");
		 al.add("kiran");
		 al.add("mounika");
		 al.add("samanth");
		 al.add("chandu");
		 
			ArrayList<String> al2= new ArrayList<String>();
			al2.add("manoj");
			al2.add("chandu");
			al2.add("mounika");
			al2.add("samanth");
//			al2.add("kiran");
			
			ArrayList<String> al3= new ArrayList<String>();
			for(String e : al) {
		 al3.add(al2.contains(e) ? "yes":"no");
			} 
		System.out.println(al3);
//		List<String> sub = al.subList(0,3);
//		{
//			System.out.println(sub);
//		}
		ArrayList<String> al4= new ArrayList<String>();
		al4.addAll(al);
		al4.addAll(al2);
		System.out.println(al4);
		
		
	}
	

}
