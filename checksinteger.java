package Class.equals;

import java.util.Scanner;

public class checksinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        String input = sc.nextLine();

	        try {
	            Integer.parseInt(input);
	            System.out.println(input + " is an integer.");
	        } catch (NumberFormatException e) {
	            System.out.println(input + " is not an integer.");
	        }
//	        System.out.println(sc.hasNextInt());
	}

}
