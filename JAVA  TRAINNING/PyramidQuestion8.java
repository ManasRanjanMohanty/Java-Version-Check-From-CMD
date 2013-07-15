import java.util.Scanner;

 


public class PyramidQuestion8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int i, j , k,n;
		int x=1;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();    


		for (i = 1; i <= n; i++) {

		for (k =1; k <=n-i; k++)

		System.out.print("");

		for (j = k+1; j <=n; j++)

		System.out.print(x);
		for(int l=n;l>k-1;l--)
		System.out.print(x);
		x++;
		System.out.println("");

		}


		}
	
		}
		
