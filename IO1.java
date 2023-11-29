import java.io.*;

public class IO1 {
    public static void main(String[] args) {
        try{    
            FileOutputStream fout=new FileOutputStream("C://Users//Harshavi//OneDrive//Desktop//lol3.txt");  
            String s = "Ganesh";
            byte b[] = s.getBytes();
            fout.write(b);   
            fout.flush();
            fout.close();    
            System.out.println("success...");    
           }
           catch(Exception e)
           {
            System.out.println(e);
           }    
     }    
}  
    

