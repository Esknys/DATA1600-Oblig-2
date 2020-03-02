import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.util.ArrayList;

public class main {

    public static void baklengsTabell(ArrayList<Integer> integers) {
            int i = integers.size() - 1;
            if (i < 0) {System.out.print("");} else {
                System.out.println(integers.get(i));
                integers.remove(i);

                baklengsTabell(integers);
            }
    }

    public static int findMin(int[] ints, int length) {
        if (length == 1)
            return ints[0];
        
        return Math.min(ints[length-1], findMin(ints, length-1));
    }

    public static int search(int[] ints, int l, int r, int x) {
        if (r < l)
            return -1;
        if (ints[l] == x)
            return l;
        if (ints[r] == x)
            return r;
        return search(ints, l+1, r-1, x);
    }


    public static void main(String[] args) {
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

    }

}