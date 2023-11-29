import java.io.*;
public class IO3 {
    public static void main(String[]args) {
        try {
            FileInputStream fin = new FileInputStream("C://Users//Harshavi//OneDrive//Desktop//lol.txt");
            int i=0;
            while((i=fin.read())!=-1){
            System.out.println((char)i);
            }
            fin.close();
        } catch (Exception e) {System.out.println(e);
            // TODO: handle exception
        }
    }
}