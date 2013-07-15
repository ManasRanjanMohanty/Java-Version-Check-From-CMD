
import java.util.Scanner;

 class Factorial
            {
public class Prime {
	
	}

public static void main(String[] arg)
            {
	
	int no,fact=1,i;
	
	System.out.println("Enter a number:");
	  Scanner sc=new Scanner(System.in);
       no=sc.nextInt();      
   
       if(no==0)
       {
    	System.out.println(1);
       }
    	else if(no==1)
    	{
    		System.out.println(1);
    		
        }
    	else if(no<0)
    	{
    		System.out.println("neggative number doesnot proceed");
    		
    	}
    	else
    	  {
    		for( i=1;i<=no;i++)
    		  
    			fact=fact*i;
          System.out.println("The Factorial of number is:"+fact);
    		}
    	}
     
       
           }
       
       
       
       
