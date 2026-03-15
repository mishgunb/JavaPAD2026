package lr2.Task8;

public class Main2 {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 7, 8);

        System.out.println("Круг:");
        circle.printRadius();
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getPerimeter());

        System.out.println("\nКвадрат:");
        square.printSide();
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());

        System.out.println("\nТреугольник:");
        triangle.printSides();
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
    }
}

