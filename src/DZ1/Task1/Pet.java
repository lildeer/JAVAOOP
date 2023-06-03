package DZ1.Task1;

public interface Pet {

    Owner OWNER = new Owner("None");

    default public void Kind() {
        System.out.println("Pet");
    }

    default public void Greet() {
        System.out.printf("Hi! I am pet. My master is %s.", OWNER.getName());
    }
}
