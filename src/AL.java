
//Oppgave 2.3

import java.util.ArrayList;


public class AL<E> {

    public ArrayList<E> list = new ArrayList<>(5);

public boolean add(E elem) {

       if (list.size() < 5) {
           list.add(elem);
           return true;
       } else {
           return false;
       }
    }

    public E get (int index) throws IndexOutOfBoundsException {

    if (index < 0 || index > list.size()) {
        throw new IndexOutOfBoundsException();
    } else {
        return list.get(index);
    }

    }

    public int size () {
        return list.size();
    }


}
