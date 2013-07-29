
import java.io.*;

class studentinfo implements Serializable{
    
    public String name;
    public int age;
    public String address;
    
    studentinfo(String st1,int a,String st2)
    {
        name=st1;
        age=a;
        address=st2;
    }
}

public class TestSeriaalization 
{

public static void main(String[] args) {
    
 studentinfo stud=new  studentinfo("Swagateaka",24,"Banglore");
 try{
 FileOutputStream fos=new FileOutputStream("studentinfo.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);

 oos.writeObject(stud);
 oos.close();
 fos.close();
 }catch(Throwable t)
 { System.out.println("Exception"+t); }
 }
}

