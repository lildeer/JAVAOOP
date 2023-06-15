package DZ1.DZ4;

public class Program {
    public static void main(String[] args) {
        int a = 10;
        String b = "b";
        double c = 2.1;
        Printer.printElement(a);
        Printer.printElement(b);
        Printer.printElement(c);

        //у меня тут возникла проблема с тем, что нельзя просто объявить массив как int[]
        Integer[] a2 = {0, 1, 2, 3, 4};
        String[] b2 = {"a", "b", "c"};
        Double[] c2 = {3.2, 2.3};

        Printer.printArray(a2);
        Printer.printArray(b2);
        Printer.printArray(c2);

        System.out.println(Printer.getMax(a2[0], a2[1]));
        System.out.println(Printer.getMax(b2[0], b2[1]));
        System.out.println(Printer.getMax(c2[0], c2[1]));
    }
}
