import java.util.Scanner;


public class SumofCubesofDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0,sum=0,a,rem,i;
		System.out.println("Armstorng number betwwen0-999");
		for(a=0; a<=900; a++)
		{
		
    number=a;
    sum=0;

while(number>0) 
{
rem=number%10;
sum=sum+rem*rem*rem;
number=number/10;
}

if(sum==a)
{
System.out.println(+sum);
}

		}
                }
}
