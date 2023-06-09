package DZ1.Task1;

import java.util.Comparator;

public class Cat implements Pet, Comparator<Cat> {

    private String name;

    private int weight;
    private int age;
    Owner owner;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner.getName();
    }

    public void setOwner(String owner) {
        this.owner = new Owner(owner);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void Greet() {
        System.out.printf("Meow! My name is %s. I am %d. My master is %s.", name, age, owner.getName());
    }

    @Override
    public void Kind() {
        System.out.println("Cat");
    }

    @Override
    //сравниваем котиков по весу
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}