
//Oppgave 2.3

import java.util.AbstractList;
import java.util.ArrayList;


public class AL<E> {

    private ArrayList<E> list;

    public AL(ArrayList<E> liste) {
        this.list = liste;
    }


public boolean add(E elem) {

   try {
       list.add(elem);
       return true;
   } catch (Exception e) {
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
