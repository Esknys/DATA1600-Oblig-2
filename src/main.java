import java.util.AbstractList;
import java.util.ArrayList;

public class main {

    //Oppgave 1.1

    public static int sum(int x) {
        if (x > 0) {
            x = x + sum(x-1);
        }
        return x;
    }

    //Oppgave 1.2

    public static int pow(int base, int exponent) {
        if (exponent > 0) {
            base = base * pow(base, exponent - 1);
        }
        return base;
    }

    //Oppgave 1.3

    public static void baklengsTabell(ArrayList<Integer> integers) {
            int i = integers.size() - 1;
            if (i < 0) {System.out.print("");} else {
                System.out.println(integers.get(i));
                integers.remove(i);
                baklengsTabell(integers);
            }
    }

    //Oppgave 1.4

    public static int findMin(int[] ints, int length) {
        if (length == 1)
            return ints[0];
        
        return Math.min(ints[length-1], findMin(ints, length-1));
    }

    //Oppgave 1.5

    public static int search(int[] ints, int l, int r, int x) {
        if (r < l)
            return -1;
        if (ints[l] == x)
            return l;
        if (ints[r] == x)
            return r;
        return search(ints, l+1, r-1, x);
    }

    //Oppgave 2.1

    public static <T> void printArray(T[] array){
        for(T a : array){
            System.out.println(a);
        }
    }

    //Oppgave 2.2

    public static <T> void reverseArray(T[] array){
        for (int i = 0; i < array.length/2; i++) {
            T temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length -1 -i] = temp;
        }
    }


    public static void main(String[] args) {

        System.out.println(sum(9));

        System.out.println(pow(2, 2));

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        baklengsTabell(integers);

        int[] ints = {2, 6, 38, 8, -30, 15, 1};

        int lengde = ints.length;

        System.out.println(findMin(ints, lengde));

        int x = 3;

        int i = search(ints, 0, ints.length -1, x);

        System.out.println(i);

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};

        printArray(array);

        reverseArray(array);

        printArray(array);

        int size = 5;
        ArrayList arrayList = new ArrayList(size);

        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;


        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        arrayList.add(four);
        arrayList.add(five);

        boolean bool = arrayList.add(six);

        System.out.println(bool);

        System.out.println(arrayList.get(1));

        System.out.println(arrayList.size());

        System.out.println(arrayList.get(6));


    }

}