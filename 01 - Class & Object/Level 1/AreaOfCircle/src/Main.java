import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int x = sc.nextInt();

        Circle c = new Circle(x);
        System.out.println("The area of the circle is " + c.getArea());
        System.out.println("The circumference of the circle is " + c.getCircumference());
    }
}