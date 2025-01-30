package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declare a List
		List<String> learners=new ArrayList<String>();
		
		//Empty List
		System.out.println("Empty list is: "+learners);
		
		//Add an element to the list
		learners.add("Saranya");
		
		System.out.println("List is: "+learners);
		
		//Add next element
		learners.add("Harrish");
		
		System.out.println("The List after added 2 data: "+learners);
		
		learners.add("Venkatesh");
		System.out.println("Current List is :"+learners);
		//    0       1         2
		//[Saranya, Harrish, Venkatesh]
		//   0        1         2         3
		//[Saranya, Bharath, Harrish, Venkatesh]
		
		//Add the element using Index
		learners.add(3, "Bharath");
		System.out.println("List after using index: "+learners);
		
		//Add duplicates
		learners.add("Harrish");
		System.out.println("List after adding duplicates is: "+learners);
		
		//Size- to count the number of element in the List
		int sizeOfList = learners.size();
		System.out.println("Size of list is : "+sizeOfList);
		//   0         1        2          3        4
		//[Saranya, Harrish, Venkatesh, Bharath, Harrish]
		//Removing an element
		learners.remove(4);
		
		System.out.println("List is : "+learners);
		
		//get method - To retrieve an element from the list using index
		String string = learners.get(3);
		System.out.println("Value at index 3 is : " +string);
		
		//addAll -1 List to Another List
		//learners -> employee
		
		//Step1: Create new List
		List<String> employees=new ArrayList<String>();
		employees.addAll(learners);
		System.out.println("Employee list is: "+employees);
		
		//Sorting - To sort in ASCII order
		//Collections
		Collections.sort(employees);
		System.out.println("List after sorting: "+employees);
		
		//clear- Clear all the data in the list
		employees.clear();
		
		System.out.println("List is : "+employees);
		
		
		

	}

}
