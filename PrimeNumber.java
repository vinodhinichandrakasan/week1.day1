package week1.day1;

public class PrimeNumber {

	

public static void main(String[] args) {



		// Declare an int Input and assign a value 13

				 int input=13;

		// Declare a boolean variable flag as false

				 boolean flag=false;

		// Iterate from 2 to half of the input

				 for (int i = 2; i < input/2; i++) {
					 int rem=input%i;
					 if(rem==0)
					 {
						 flag=true;
						 //System.out.println(flag);
						 break;
					 }
					
				}
				 
				 if(flag==false)
				 {
					 System.out.println("Given input "+input+" is a Prime number");
				 }
				 else if(flag==true)
				 {
					 System.out.println("Given input "+input+" not a Prime number");
				 }

					

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 

   }

}