
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Tokenizing {
  static String[] keyOperatorStringArray = {"+","-","*","/"};
	static List key;
   static String[] keyWordStringArray ={"abstract","assert","boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","final","finally","float","for","goto","if","implements","import","instanceof","int","interface","long","native","new,package","private","protected","public","return","short","static","strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while"};
    
   
   public static void main(String ar[]){
	  
	   List<String> Opertor = Arrays.asList(keyOperatorStringArray);
       Set<String> myOpertor = new HashSet<String>();
    
       List<String> keyWord = Arrays.asList( keyWordStringArray);
       Set<String> myKeyword = new HashSet<String>();
    
             try {
            String sReadLine = null;
            BufferedReader br=new BufferedReader(new FileReader("C:/Users/manas/Desktop/D.txt"));
            while ((sReadLine=br.readLine())!=null) {
            
            	
            	String[] tokonizePart =  sReadLine.split("");
                for (String tokonizePartInsideFor : tokonizePart )
                  {
                    if(Opertor.contains(tokonizePartInsideFor))
                            {
                      myOpertor.add(tokonizePartInsideFor);
                            }
                  }
               
                String[] tokonizePart1 =  sReadLine.split("\\s");
                for (String tokonizePartInsideFor1: tokonizePart1 )
                   {
                    if(keyWord.contains(tokonizePartInsideFor1))
                         {
                    	myKeyword.add(tokonizePartInsideFor1);
                         }
                  }
            }
            
            System.out.println("The listof operators are:");
            for(String my : myOpertor)
           {
                System.out.println(my +" ");
           }
            System.out.println("The listof keywords are:");
            for(String my : myKeyword)
            {
            	System.out.println(my +" ");
            }
            
                    
            
            
            br.close();
        }
        catch (Exception e){

        }

    }
}