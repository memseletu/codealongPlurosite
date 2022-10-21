import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception13a {
    //it is an unexpected event that occurs during runtime due to an error.
    //affects normal flow of code.
    //you can handle exceptions during  a code so the program  does not crash
    //all exceptions inherit from the Exception class
    public static void main(String[] args) {
        createNewFile();
        nmbersExceptionsHandling();

    }



    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
       try {
           file.createNewFile();
       }catch(IOException ex) {
           System.out.println("Directory does not exist");
           ex.printStackTrace();
       }
       }
    public static void nmbersExceptionsHandling() {
        File file = new File("resources/numbers.txt");
       try {
           Scanner fileReader = new Scanner(file);
             while(fileReader.hasNext()){
               double num = fileReader.nextDouble();
                 System.out.println(num);
             }

       } catch (FileNotFoundException e) {

       }catch (InputMismatchException e){

       }finally {

       }
    }
    }


