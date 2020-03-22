package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {

    // objects: Liste med objekter, ? tillater alle typer lister
    // Bruker List sin toString metode. List bruker videre toString til objektene i listen
    // Så vi lager ny fil. Returnerer ingenting.

    //FileSaver.makefile(navn) -- Lager filen.
    // savecontent(string, file) -- Legger innhold til filen og lagrer.

    // FileSaver.makefile(Navn.txt) lager navnet på filen

    // FileSaver.savecontent(document d, Navn.txt)
    // Lagrer da document d i navn.txt.

    public static void savecontent(Document d, File file) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        writer.write(d.toString());
        writer.close();
    }
}
