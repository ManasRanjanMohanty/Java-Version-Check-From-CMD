public class ExceptionHandlingProgram {
    void vaalidate(int no){
        try{
        if(no > 1000)
            throw new CoustomException();
        }
        catch (CoustomException e){
            System.out.print("number should be less than 1000");
        }

    }
    public static void main(String ar[]){
        ExceptionHandlingProgram  ExceptionProgram = new  ExceptionHandlingProgram ();
        ExceptionProgram.vaalidate(145);
    }
}