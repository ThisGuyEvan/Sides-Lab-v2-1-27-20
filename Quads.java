import java.util.Scanner;

public class Quads extends Shapes{
  //Intializing static variables.

  private static double length;
  private static double width;
  //Constructor
  Quads(double length, double width){
    super(4);
    this.length = length;
    this.width = width;
  }

  //Finding Area and perimeter.
  static void area(){
    System.out.println("Area: " + length * width);
  }

  static void perimeter(){
    System.out.println("Perimeter: " + ((length + width) * 2));
  }

  static String getFields(){
    return "Current Length: " + length + "\n Current Width: " + width; 
  }

  //getters and setters
  static void setFields(){
    Scanner console = new Scanner(System.in);

    System.out.print("Set Length: ");
    length = console.nextDouble();

    System.out.print("\nSet Width: ");
    width = console.nextDouble();

    System.out.println("\nSuccessfully modified!");
    console.close();
  }

}