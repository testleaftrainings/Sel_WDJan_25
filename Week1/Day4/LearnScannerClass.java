package week1.day4;

import java.util.Scanner;

public class LearnScannerClass {

	public static void main(String[] args) {
		
		//Scanner
		Scanner scan=new Scanner(System.in);
		//int - nextInt
		//String - nextLine
		
        //Entering the name
		System.out.println("Enter the name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter the age: ");
		int age = scan.nextInt();
   }

}
