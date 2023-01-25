package arraysutil;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array= {"manoj","samanth","kiran","mounika"};
		System.out.println("printing Array:"+Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		
	for(String lang:array) {
		list.add(lang);
	}
	
	System.out.println("Printing:"+list);
	}

}
