import java.util.ArrayList;
import java.util.List;

public class Generisk<E> {

    //Oppgave 2.1

    public <T> void writeArray(ArrayList<? extends E> list) {
        for (E e : list) {
            System.out.println(e);
        }
    }
}
