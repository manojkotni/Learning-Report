package arraysutil;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("apple");
		al.add("orage");
		al.add("banana");
		al.add("milk");
		System.out.println(al);
		if(al.contains("banana")) {
			System.out.println("banana");
		}
		else {
			System.out.println("element not in the list");
		}
		Collections.reverse(al);
		System.out.println(al);

	}

}
