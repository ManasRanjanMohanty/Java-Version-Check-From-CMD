import java.util.Scanner;


public class OvertimepayofEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Hour,overtime=0;
		System.out.println("Enter the over time work:");
		 Scanner sc=new Scanner(System.in);
		 Hour=sc.nextInt(); 
		
			overtime=Hour*12;
			
		
		
       System.out.println("The amount of overtime is:"+overtime);    
	}

}
