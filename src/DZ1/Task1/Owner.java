package DZ1.Task1;

public class Owner implements Human {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Name() {
        System.out.println(name);
    }
}