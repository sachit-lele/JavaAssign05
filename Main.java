import java.util.Scanner;
//Name: Sachit Lele, PRN: 21070126072
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Sphere");
        System.out.println("5. Cylinder");
        System.out.println("6. Pyramid");

        int choice = input.nextInt();
        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                Circle circle = new Circle(radius);
                result = circle.calculateArea();
                circle.printShape("Circle");
                System.out.println("Area of the circle: " + result);
                System.out.println("Perimeter of the circle: " + circle.calculatePeri());
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                result = rectangle.calculateArea();
                rectangle.printShape("Rectangle");
                System.out.println("Area of the rectangle: " + result);
                System.out.println("Perimeter of the rectangle: " + rectangle.calculatePeri());
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                double side = input.nextDouble();
                Square square = new Square(side);
                result = square.calculateArea();
                square.printShape("Square");
                System.out.println("Area of the square: " + result);
                System.out.println("Perimeter of the square: " + square.calculatePeri());
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = input.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                result = sphere.calculateArea();
                sphere.printShape("Sphere");
                System.out.println("Surface area of the sphere: " + result);
                System.out.println("Volume of the sphere: " + sphere.calculateVolume());
                break;
            case 5:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = input.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = input.nextDouble();
                Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                result = cylinder.calculateArea();
                cylinder.printShape("Cylinder");
                System.out.println("Surface area of the cylinder: " + result);
                System.out.println("Volume of the cylinder: " + cylinder.calculateVolume());
                break;
            case 6:
                System.out.print("Enter the base of the pyramid: ");
                double pyramidBase = input.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double pyramidHeight = input.nextDouble();
                Pyramid pyramid = new Pyramid(pyramidBase, pyramidHeight);
                result = pyramid.calculateArea();
                pyramid.printShape("Pyramid");
                System.out.println("Area of the pyramid: " + result);
                System.out.println("Volume of the pyramid: " + pyramid.calculateVolume());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
