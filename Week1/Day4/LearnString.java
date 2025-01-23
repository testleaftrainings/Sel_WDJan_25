package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		
		//String declaration by Literal
		String name1="TestLeaf";
		
		String name3="TestLeaf";
		
		//String declaration by Instantiation
		String name2=new String("Testleaf");
		String name4=new String("TestLeaf");
		
		// .equals - compares the content of two strings
		// ==      - compares the reference address of two strings
		
		System.out.println(name1==name3);
		
		System.out.println(name2==name4);
		
		System.out.println("-----------");
		
		//.equals
		System.out.println("Equals: "+name1.equals(name2));
		
		//equalsIgnoreCase - it will ignores the case when comparing
          System.out.println(name1.equalsIgnoreCase(name2));

        //Contains-partial match
        System.out.println("Contains: "+name1.contains(name2));


                 // 012345
      String batch="SelJan";   

     //Length of the String
      int lengthOfString = batch.length();
      System.out.println("Length of string is: "+lengthOfString);

	  //To uppercase         //SELJAN
      String upperCase = batch.toUpperCase();
      System.out.println(upperCase);
      
      //chatAt - CharacterAT - to get the particular character
      //index starts from 0
      
     char charAtIndex2 = batch.charAt(3);
      System.out.println(charAtIndex2);
      
      //toCharArray
      
      //convert string into Character Array
      //String batch="SelJan";
      //SelJan ={'s','e','l','J','a','n'};
      char[] charArray = batch.toCharArray();
      System.out.println(charArray[1]);
      
      String str="SelJan2025";
      
      //Split - Split the String into multiple Strings
      String[] split = str.split("J");
     System.out.println(split[0]);
     
     
     
     String replaceAll = str.replaceAll("[0-9]", "");
     System.out.println(replaceAll);
     
     //SubString - Crop a String to its shorter format
       String str1="Testleaf";
     
     //begin index is inclusive
     //End index is exclusive
     String substring = str1.substring(2); 
     System.out.println(substring);
     
     String substring2 = str1.substring(2, 4);
     System.out.println(substring2);
  
     //ParseInt
     //Convert a String into Int
     
     String str2="1000";
     int amount=100;
     System.out.println(amount+str2); //1001000
     
     //Integer wrapper Class
     int parseInt = Integer.parseInt(str2);  //1000
     System.out.println(amount+parseInt);
     
    }

}
