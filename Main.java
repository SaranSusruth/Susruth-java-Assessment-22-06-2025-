import java.util.Scanner;

public class Main 
{
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);  
        while(true)
        {
            System.out.print("Choose a shape: Circle or Rectangle (or type 'exit' to quit): ");
            String myChoice = sc.nextLine();
            System.out.println("\n");

            if (myChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thank you");
                break;
            }

            if(myChoice.equalsIgnoreCase("Circle"))
            {
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("\n");
                sc.nextLine();
                Circle circle = new Circle(radius);
                System.out.println("Shape: " + circle.getName());
                System.out.println("Area: " + circle.area());
                System.out.println("Perimeter: " + circle.perimeter());
                System.out.println("\n");
            }
            else if (myChoice.equalsIgnoreCase("Rectangle"))
            {
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = sc.nextDouble();
                System.out.println("\n");
                sc.nextLine();
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("Shape: " + rectangle.getName());
                System.out.println("Area: " + rectangle.area());
                System.out.println("Perimeter: " + rectangle.perimeter());
                System.out.println("\n");
            }
        }
        sc.close();
    }
}
