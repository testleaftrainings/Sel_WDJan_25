package week1.day3;

import java.util.Arrays;

public class LearnArrays {
	
	//To store a data
	//int
	int number=20;
	
	
	
	public static void main(String[] args) {
		// Declare array by Literal
		//Store scores of a student in 5 exams
		             // 0  1  2  3  4
		int[] scores= {68,71,67,89,72};
		
		//scores[0]=68;
		
		//To get a particular value- use index
		System.out.println("Score at index 3: " +scores[3]);
		
		//ArrayIndexOutOfBoundsException
		
		//To find the length of the Array
		int lengthOfArray = scores.length;
		System.out.println("Length of array: "+lengthOfArray);
		
		//To retrieve the lowest value
		//Sort the array- sort in the ascending order
		Arrays.sort(scores);
		//67,68,71,72,89
		
		System.out.println(scores[0]);
		
		//To get the highest value  length
		//length=5-1  length[4]
		System.out.println(scores[lengthOfArray-1]);
		
		//To get all the values - for loop
		
		
	for (int i = 0; i < scores.length; i++) {
			System.out.println("All values:" +scores[i]);
			//scores[0]=67
			//scores[1]=68
			//scores[2]=71
			//scores[3]=72
			//scores[4]=89
		}
	
	
	//By Instantiation 
	//Size of array upfront
	//0 1 2 3 4
	int[] marks=new int[5];
	marks[0]=56;
	marks[1]=67;
	marks[2]=75;
	marks[3]=31;
	marks[4]=56;
	
	
	//{2, 5, 7, 7, 5, 9, 2, 3};
	//{2,2,3,5,5,7,7,9}
	
	
		

	}

}
