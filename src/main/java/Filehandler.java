import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import Superhero.Superhero;

public class Filehandler {
    private final File file = new File("demo.txt");
    PrintStream printStream = new PrintStream(file);

    public Filehandler() throws FileNotFoundException {
    }
    public void savedata(){
        printStream.println("hey");
    }


}
