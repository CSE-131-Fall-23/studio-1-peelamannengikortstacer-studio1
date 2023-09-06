package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First number?");
		int n1 = in.nextInt();
		System.out.println("Second number?");
		int n2 = in.nextInt();
		System.out.println("The average of these two numbers is " + ((n1 + n2)/2.0));
	}

}
