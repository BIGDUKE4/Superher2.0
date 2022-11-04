import ui.Userinterface;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Userinterface ui = new Userinterface(); //Ui.Userinterface initialiseret
      ui.startProgram(); //Kalder UI metoden

        Filehandler filehandler = new Filehandler();
        filehandler.savedata();

    }
}