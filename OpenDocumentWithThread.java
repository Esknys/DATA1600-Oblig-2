package sample;

import javafx.concurrent.Task;

import java.io.File;
import java.io.IOException;

public class OpenDocumentWithThread extends Task<Document> {

    private final int ver;

    public OpenDocumentWithThread(int value) {
        this.ver = value;
    }

    @Override
    protected Document call() throws InterruptedException, IOException {
        // emulerer en "stor" jobb på 3 sekunder...
        // Henter versjonen vi skal åpne

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        File file = new File("dokument-v" + ver + ".txt");

        Document htmldoc = FileReader.readDocument(file);

        //   htmlid.setHtmlText(htmldoc.toString());

        return htmldoc;
    }
}
