import java.util.Scanner;


public class CirclePointonRadius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
    	Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int radius = scan.nextInt();
	     int	point_x,point_y;
	
	     for ( point_x = 0; point_x < radius; point_x++) {
	 		for ( point_y = 0; point_y < radius; point_y++) {
	
	 			
	 		if	( (point_x*point_x)  + (point_y*point_y)  <  (radius)*(radius));
	 		        {
	 		System.out.print("(point_x,point_y)" );     	
	 		System.out.println("(" +point_x + "," + point_y +")\t");
	 		        }
	 		}
	     }
	}

}
