import java.io.*;
import java.util.Scanner;
public class FilesApp {
    public static void write(String str){

        try(FileWriter writer = new
                FileWriter("D:notes3.txt", false)) {
            writer.write(str);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void rewrite(String str){

        try(FileWriter writer = new
                FileWriter("D:notes3.txt", true)) {

                writer.write(str);
                writer.flush();

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = in.nextLine();
        //1)
        write(text);
        //2)

        //3)
        System.out.println("\nВведите строку");
        text = in.nextLine();
        write(text);
        read();
        //5)
        System.out.println("\nВведите строку");
        text = in.nextLine();
        rewrite(text);
        read();
        in.close();
    }
    public static void read(){
        try(FileReader reader = new
                FileReader("D:notes3.txt"))
        {
            // чтение по символам
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }

}
