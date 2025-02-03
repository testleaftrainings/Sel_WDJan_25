package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicates {

	public static void main(String[] args) {
		//Input
		int numbers[]= {2,3,4,3,2,5};
		
		//Output - [2,3,4,5]
		
		Set<Integer> unique=new TreeSet<Integer>();
		//        0           length-1
		for (int i = 0; i < numbers.length; i++) {
			unique.add(numbers[i]);
			unique.add(numbers[0]); // [2]
			unique.add(numbers[1]);  //[2,3]
			unique.add(numbers[2]);  //[2,3,4]
			unique.add(numbers[3]);  //[2,3,4]
			unique.add(numbers[4]);  //[2,3,4]
			unique.add(numbers[5]);  //[2,3,4,5]
		}
		
		System.out.println("The set is : "+unique);

		
   }

}


//String="google"
//[g,o,l,e]



