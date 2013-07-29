import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TakinguserInput {
	static int i;  
	
		 
		    
		    public static void main(String[] args) throws IOException{  
		  
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
		          
		        //i = reader.read();  
		    i = Integer.parseInt(reader.readLine());
		        System.out.print(i);  
		    }  
		  

	}
	
