
//Oppgave 2.3


public class ArrayList<E> {

    private static Object[] objects;
    private int størrelse;
    private int i = 0;

    public ArrayList(int size) {
                 objects = new Object[size];
                 this.størrelse = size;
    }


public <E> boolean add(E elem) {
        if (i >= størrelse) {
            return false;
        }
            objects[i] = elem;
            i = i + 1;
            return true;
        }



    public <E> E get (int index) throws IndexOutOfBoundsException {

    if (index < 0 || index > size()) {
        throw new IndexOutOfBoundsException();
    } else {
        return (E)objects[index];
    }

    }

    public int size() {
        int nullplasser = 0;

        for (Object o : objects) {
            if (o == null) {
                nullplasser++;
            }

        }
        return størrelse - nullplasser;
    }


}