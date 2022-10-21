import java.io.File;
import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) {

    }


    //public static void createNewFile() {...}

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();


    }
}