import java.util.Scanner;

class Powerofnumber 
             {
	
	  public static void main(String[] arg)
	            {
		  
		  int number,  exponent;
			
			
			System.out.println("Enter a number:");
			 Scanner sc=new Scanner(System.in);
			 number=sc.nextInt();    
		    
		  
		  
		System.out.println("Enter a its exponent:");
		Scanner h=new Scanner(System.in);
		exponent=h.nextInt();   
			          
	
		Powerofnumber ob=new Powerofnumber();
         ob.power(number,exponent);

	            }
	
	 void power(int number, int exponent)
	  {
	  	int i, product = 1;
	  	for (i = 0; i < exponent; i++)
	  		product *= number;
	  	System.out.println(+product);
	  	
	     }
}