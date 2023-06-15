package DZ1.DZ4;

public class Printer<T> {
    public static <T> void printElement(T t) {
        System.out.println(t + " is " + t.getClass());
    }

    ;

    public static <T> void printArray(T[] t) {
        for (T element : t
        ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T getMax(T t1, T t2) {

        return t1.compareTo(t2) == 1 ? t1 : t2;
    }
}
