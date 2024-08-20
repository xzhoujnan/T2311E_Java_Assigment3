import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====Calculator Shape Program=====");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Please input width of Rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Please input radius of Circle: ");
        double radius = sc.nextDouble();
        System.out.println("Please input side A of Triangle: ");
        double sideA = sc.nextDouble();
        System.out.println("Please input side B of Triangle: ");
        double sideB = sc.nextDouble();
        System.out.println("Please input side C of Triangle: ");
        double sideC = sc.nextDouble();

        Rectangle rect = new Rectangle(length, width);
        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        rect.printResult();
        circle.printResult();
        triangle.printResult();
    }
}