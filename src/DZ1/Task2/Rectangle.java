package DZ1.Task2;

public class Rectangle implements RectImp {

    private int width;
    private int height;

    public Rectangle() {
        new Rectangle(0, 0);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (width + height);
    }
}
