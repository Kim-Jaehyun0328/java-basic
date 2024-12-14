package class3;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {

    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println("넓이: " + width*height);
    }
    public void calculatePerimeter() {
        System.out.println("둘레 길이: " + 2 * (width + height));
    }
    public void isSquare() {
        System.out.println("정사각형 여부: " + (width == height));
    }
}
