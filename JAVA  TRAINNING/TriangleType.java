import java.math.*;
public class TriangleType {
public static void main(String[] args) {
	int s1=6;
	int s2=4;
	int s3=7;
   
	if(((s1*s1)+(s2*s2)==(s3*s3)) || ((s1*s1)+(s3*s3)==(s2*s2)) || ((s3*s3)+(s2*s2)==(s1*s1)))
	{
		System.out.println("Right angled triangle");
	}
	else if((s3^2)<(s1^2+s2^2))
	
	{
		System.out.println("Acute angled triangle");
	}
	else if((s3^2)>(s1^2+s2^2))
	
	{
		System.out.println("Obtuse angled triangle");
	}

	if(s1==s2&&s2==s3&&s1==s3)
	{
		System.out.println("Equilateral Triangle");
	}
	else if(s1==s2||s1==s3||s2==s3)
	{
		System.out.println("Isoceles triangle");
	}
}
}