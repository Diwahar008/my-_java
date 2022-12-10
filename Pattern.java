package prat;

import java.util.Scanner;

public class Pattern {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int n = sc.nextInt(); System.out.println("Enter your number"+n);
		 */
		System.out.println("Enter your number");
		int w  = sc.nextInt();
		for(int i=1;i<=w;i++) {
	    for (int j = w;j>=i;j--) {
			System.out.print(" ");
			}
	    for (int j=1;j<=i;j++) {
	    	System.out.print("* ");
	    	
	    }
        System.out.println();

	    
		}

		sc.close();

	}

}
