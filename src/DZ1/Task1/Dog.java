package DZ1.Task1;

import java.util.Comparator;

public class Dog implements Pet, Comparable<Dog> {

    private String name;

    private int weight;
    private int age;
    Owner owner;

    public Dog(String name, int weight, int age, Owner owner){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
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

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void Greet() {
        System.out.printf("Auf! My name is %s. I am %d. My master is %s.", name, age, owner.getName());
    }

    @Override
    public void Kind() {
        System.out.println("Puppy");
    }


    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
    @Override
    public String toString(){
        return String.format("%s: %d years old", getName(), getAge());
    }
}

