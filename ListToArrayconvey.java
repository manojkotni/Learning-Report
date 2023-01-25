package arraysutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayconvey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li= new ArrayList<String>();
		
		li.add("Manoj");
		li.add("kiran");
		li.add("mounika");
		li.add("samanth");
		String[] array=li.toArray(new String[li.size()]);
		System.out.println("printing Arrray:"+Arrays.toString(array));
		System.out.println("printing list:"+li);
	}

}
