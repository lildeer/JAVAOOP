public class Cat {

    private String name;
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

    public void setOwner(String owner){
        this.owner = new Owner(owner);
    }

    public void Greet(){
        System.out.printf("Meow! My name is %s. I am %d. My master is %s.", name, age, owner.getName());
    }
}