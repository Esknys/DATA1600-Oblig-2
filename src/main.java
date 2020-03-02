import java.util.ArrayList;

public class main {

    public static void baklengsTabell(ArrayList<Integer> integers) {
            int i = integers.size() - 1;
            if (i < 0) {System.out.print("");} else {
                System.out.print(integers.get(i));
                integers.remove(i);

                baklengsTabell(integers);
            }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        baklengsTabell(integers);

    }

}