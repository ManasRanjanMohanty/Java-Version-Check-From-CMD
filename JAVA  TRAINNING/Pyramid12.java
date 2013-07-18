import java.util.Scanner;


public class Pyramid12 {
    
	
	
	public static void main(String[] a){
       
		
		
     System.out.println("enter size of pyramid");
     Scanner sc=new Scanner(System.in);
        
     int size=sc.nextInt();
     for(int i=1;i<=size;i++)
     
         {
       
     for(int j=96+i;j<=96+2*i-1;j++)
            
    	 System.out.print((char)j);
         System.out.println();

        }
        System.out.println((char)size);
    }
    }