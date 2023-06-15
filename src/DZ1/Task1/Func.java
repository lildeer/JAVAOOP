package DZ1.Task1;

@FunctionalInterface
public interface Func<T extends Pet> {
    public boolean haveBabies(T t, T u);
}
