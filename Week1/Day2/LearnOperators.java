package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// Assignment operator
		//Arithmetic operator
		//Comparison Operator
		//Logical operator
		//Increment and Decrement operator
		
		// Assignment operator
		int number=20;
		
		//Arithmetic operators (Add, sub, mul, div, mod)
		 int a=7;
		 int b=2;
		 
		 //Add(+)
		System.out.println(a+b);
		
		//Sub (-)
		System.out.println(a-b);
		
		//mul (*)
         System.out.println(a*b);
         
         //div (Quotient and Remainder)
         
         //To get quotient (/)
         System.out.println(a/b);
         
         //To get the remainder (%)
         System.out.println(a%b);
         
         System.out.println("----------------");
         
         
         //Comparison operator
        
         int p=4;
         int q=5;
         System.out.println(p==q);
         System.out.println(p!=q);
         System.out.println(p<q);
         System.out.println(p<=q); //p<q  and p=q
         System.out.println(p>q);
         System.out.println(p>=q); //p>q   and p=q
         
         
         System.out.println("------------");
         
         //Logical Operator - 2 Conditions
         //And operator Cond1 and Cond2 -true
         //Or Operator  Cond1 or Cond2  -true
         //And &&
         //Or ||
         int c=8;
         int d=10;
         
         System.out.println(c<d&&c==d);
         
         System.out.println(c<d||c==d);
         
         System.out.println(c<d||c>d);
         
         System.out.println("-------------");
         
         //Decrement and Increment operator
         //preIncrement and postIncrement
         //preDecrement and postDecrement
         
         //postIncrement (s++) -increase the number by 1
         int s=7;
         System.out.println(s++);  //7
         System.out.println(s);    //8
         
         //preIncrement (++s) increase the number by 1
         System.out.println(++s);  //9
         
         //postDecrement (s--) decrease the value by 1
         System.out.println(s--);  //9
         System.out.println(s);    //8
         
         //preDecrement (--s) decrease the value by 1
         System.out.println(--s);
         }
}
