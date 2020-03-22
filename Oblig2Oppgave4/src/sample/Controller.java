package sample;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import org.omg.CORBA.INITIALIZE;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Controller {

    public int ver;

    @FXML
    private AnchorPane bakgrunnid;

    @FXML
    private HTMLEditor htmlid;

    @FXML
    private Button openid;

    @FXML
    private Button saveid;

    @FXML
    private TextField textfieldid;

    private OpenDocumentWithThread task;

    public Controller() {
        ver = 0;
    }

    public void initialize() {
        textfieldid.setText("Version");
    }

    @FXML
    void openaction(ActionEvent event) throws IOException {

        int vers = Integer.valueOf(textfieldid.getText());

        // Prøver å lage en thread men får det ikke til.
        // Vetta faen hva jeg skal gjøre.
        task = new OpenDocumentWithThread(vers);
        task.setOnSucceeded(this::threadOpenDocumentDone);
        task.setOnFailed(this::threadOpenDocumentFailed);
        Thread th = new Thread(task);
        th.setDaemon(true);
        openid.setDisable(true);
        saveid.setDisable(true);
        htmlid.setDisable(true);
        textfieldid.setDisable(true);
        th.start();
    }

    private void threadOpenDocumentDone(WorkerStateEvent e) {
        Document doc = task.getValue();
        openid.setDisable(false);
        saveid.setDisable(false);
        htmlid.setDisable(false);
        textfieldid.setDisable(false);
        String text = doc.toString();
        htmlid.setHtmlText(text);
    }

    private void threadOpenDocumentFailed(WorkerStateEvent event) {
        Throwable e = event.getSource().getException();
        htmlid.setHtmlText("Avviket sier: " + e.getMessage());
        openid.setDisable(false);
        saveid.setDisable(false);
        htmlid.setDisable(false);
        textfieldid.setDisable(false);
    }

    @FXML
    void saveaction(ActionEvent event) throws IOException {

        //Henter ut int i textfield
        // Plusser på versjonen 1, og lager fil med den versjonen.
        // Attributtet på hvilken versjon det er, er altså her i controller.

        this.ver = this.ver + 1;
        textfieldid.setText(""+ver);

        File file = new File("dokument-v" + this.ver + ".txt");

        // Henter data i htmlid
        String data = htmlid.getHtmlText();
        System.out.println(data);

        // Legger dataen i et dokument objekt, med attributtet content
        Document content = new Document(data);

        // Lagrer det i fil.
        FileSaver.savecontent(content, file);
    }

    @FXML
    void textfieldaction(ActionEvent event) {

    }

}
