import java.util.Scanner;

public class Triangles extends Shapes{
  //Intializing static variables.
  private static double a;
  private static double b;
  private static double c;
  private static double height;
  private static double base;
  //Constructor
  Triangles(double a, double b, double c){
    super(3);

    this.a = a;
    this.b = b;
    this.c = c;
    this.height = a/b * 2;
    this.base = a/height * 2;
  }
  //Finding Area and perimeter.
  static void area(){
    double area = (a + b + c) / 2;
    System.out.println("Area: " + Math.sqrt(area * (area - a) * (area - b) * (area - c)));
  }

  static void perimeter(){
    System.out.println("Perimeter: " + (a + b + c));
  }

  static void getFields(){
    System.out.println("Current Side A: " + a + "\nCurrent Side B: " + b + "\nCurrent Side C: " + c);
  }
  //getters and setters
  static void setFields(){
    Scanner console = new Scanner(System.in);
    System.out.print("Set Side A: ");
    a = console.nextDouble();
    System.out.print("Set Side B: ");
    b = console.nextDouble();
    System.out.print("Set Side C: ");
    c = console.nextDouble();
    System.out.println("\nSuccessfully modified!");
    console.close();
  }
}