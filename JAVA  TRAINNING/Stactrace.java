/**
 * @author manas
 *
 */
public class Stactrace {
public static void main(String [] args) {
		      a(1);
		   }
public static void a(int arg) {
		      b(arg);
		   }
public static void b(int arg) {
	Throwable t = new Throwable ();
		      t.printStackTrace();
		   }

		}