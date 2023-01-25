package Class.equals;

import java.util.Scanner;

public class Kmtomiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the distance in Km");
	float Km= sc.nextFloat();
	float miles = (float)(0.621369647819236 *Km);
	System.out.println("distance in miles :"+miles);
	}

}
