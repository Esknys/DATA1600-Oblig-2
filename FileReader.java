package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    // Returnerer en ObservableList med doumenter
    // ObservablieList = A list ta allows listener to track changes when the occur.
    // Hva gjør egentlig metoden under?

    // Returnerer en liste med document-objekter.
    // Filen har blitt scanna, og nå er en liste med d objekter tilbake eller noe?

    // Returnerer Document objekt fra filen file.

    public static Document readDocument(File file)
            throws IOException
    {
        Document d = new Document("");
        try (Scanner myReader = new Scanner(file)) {

            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();
                d.content += line;
            }
        }
        return d;
    }

}
