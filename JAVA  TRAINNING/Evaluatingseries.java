import java.util.Scanner;
public class Evaluatingseries {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double sum=0,i,n;
      
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the  value n: ");
		n = scanner.nextInt();
        for(i=1;i<=n;)
        {
            sum = sum + (1/i);
           i=i+2;
        }
	System.out.println("THE SUM OF THIS SERIES IS:"+sum);
        
    }	
		
		
		}


