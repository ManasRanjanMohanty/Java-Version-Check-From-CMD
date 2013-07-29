
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
public class CopyFileExample 
{
    public static void main(String[] args)
    {	
 
    FileInputStream   iStream = null;
	FileOutputStream  oStream = null;
 
    	try{
 
    	    File file1 =new File("D:/Nthdimenzio/workspace/WEEK3/Testing2.txt");
    	    File file2 =new File("E:\\Testing2.txt");
 
    	    iStream = new FileInputStream(file1);
    	    oStream = new FileOutputStream(file2);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = iStream.read(buffer)) > 0){
 
    	    	oStream.write(buffer, 0, length);
 
    	    }
 
    	iStream.close();
    	    oStream.close();
 
    	    //delete the original file
    	   //file.delete();
 
    	    System.out.println("File is copied successful!");
 
    	}catch(IOException e){
    	    e.printStackTrace();
    	}
    }
}
