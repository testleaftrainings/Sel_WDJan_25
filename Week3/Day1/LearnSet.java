package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//Implementation
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		System.out.println("The set is: "+mentors);
		
		//Add
		mentors.add("Udai");
		System.out.println("The set is :"+mentors);
		
		//Add
		mentors.add("Harrish");
		mentors.add("Vinoth");
		mentors.add("Saranya");
		System.out.println("The current is : "+mentors);
		
		//Add duplicate
		mentors.add("harrish");
		System.out.println("The Set is: "+mentors);
		
		//Remove an element
		mentors.remove("harrish");
		System.out.println("Set after removing:"+mentors);
		
		//Size of Set
		int sizeOfSet = mentors.size();
		System.out.println("Size is: "+sizeOfSet);
		
		//addAll - To add all elements from 1 set to another
		Set<String> trainers=new HashSet<String>();
		System.out.println("Set before adding: "+trainers);
		trainers.addAll(mentors);
		System.out.println("Set after adding: "+trainers);
		
		//To retrieve an element in the Set
		//Empty List
		List<String> employee=new ArrayList<String>(trainers);
		System.out.println("List is :"+employee);
		String string = employee.get(1);
		System.out.println(string);
	}
}
