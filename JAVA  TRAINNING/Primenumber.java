import java.util.Scanner;

class Primenumber
  {
public static void main(String[] args) {
	int num, i;
	System.out.println("Enter a number:");
	 Scanner sc=new Scanner(System.in);
	 num=sc.nextInt(); 
 if(num==0||num==1){
	 System.out.println("Take Other number:");
               }
	 
	 for (i=2;i<num;i++ ){
                if (num%i==0)
                     {
               System.out.println("not Prime!");
               
                     }
                break;
                 }
	 

 
if(num%i!=0)

   {
System.out.println("Prime number!");
   }
}
}