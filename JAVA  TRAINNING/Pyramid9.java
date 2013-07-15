import java.util.Scanner;


class Pyramid9
{
public static void main(String args[])
{
int i,j,n;
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();    




for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print(" "+j);
System.out.println(" ");
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
System.out.print(" "+j);
System.out.print("\n");
}
}
}