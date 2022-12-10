package prat;

import java.util.Scanner;

//import java.util.*;


public class Pract1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your name");
		String name = sc.nextLine();
		System.out.println("type your rating");
		float num = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Your Email");

		String Email = sc.nextLine();
		System.out.println("hello "+name);

			System.out.println("your rating is "+num);
			System.out.println("your Email"+Email);
		sc.close();
	
	}
}
