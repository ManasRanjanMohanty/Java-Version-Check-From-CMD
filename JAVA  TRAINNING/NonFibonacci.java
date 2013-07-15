import java.util.Scanner;
 class NonFibonacci {
public static void main(String arg[])
	{
		
	int n,a,b,c,d,i;
		 
		a=0;
		b=1;
		c=0;
		System.out.println("Enter a number");
	    Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();

		while(c<=n)
		{
			c=a+b;
			a=b;
			b=c;
			d=a+b;

			for(i=c+1;i<d;i++)
			{
				if(i<=n)
					System.out.println(i);
				 
			}
		}
	}
	}