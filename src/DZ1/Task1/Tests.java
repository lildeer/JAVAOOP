package DZ1.Task1;

import java.util.TreeSet;

public class Tests {
    public static void main(String[] args) {
        TreeSet<Cat> cats = new TreeSet<>();
        TreeSet<Dog> dogs = new TreeSet<>();
        Owner petya = new Owner("Petya");
        Owner lera = new Owner("Lera");

        Cat murka = new Cat("Murka", 10, 4, petya);
        Cat vaska = new Cat("vaska", 12, 3, lera);
        cats.add(murka);
        cats.add(vaska);

        Dog sharik = new Dog("Sharik", 10, 4, petya);
        Dog betta = new Dog("betta", 12, 3, petya);
        dogs.add(sharik);
        dogs.add(betta);
        Func<Cat> tryBabyByOwner = (a, b) -> a.getOwner().equals(b.getOwner());
        System.out.println(tryBabyByOwner.haveBabies(murka, vaska));

        Func<Dog> tryBabyAnotherWay = (a, b) -> {
            return ((a.getWeight() + b.getWeight()) > 3 && (a.getOwner().equals(b.getOwner())));
        };
        System.out.println(tryBabyAnotherWay.haveBabies(sharik, betta));

        System.out.println(dogs.toString());
        System.out.println(cats.toString());

    }
}
