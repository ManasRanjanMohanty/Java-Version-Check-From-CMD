/*Deserialization of studentinfo class Object*/


import java.io.*;

public class TestDeserilization 
{
    static public void main(String arg[])
    {
       studentinfo em=null; 

try{
/*Open file Studentinfo.ser in read mode*/

FileInputStream fis=new FileInputStream("Studentinfo.txt");
ObjectInputStream ois=new ObjectInputStream(fis);

/*Object is deserializes using readObject() method*/
em=(studentinfo)ois.readObject();
        
}catch(Throwable t){ System.out.println("Exception"+t); }
        
        System.out.println(em.name);
        System.out.println(em.age);
        System.out.println(em.address);
        
    }
    
}
