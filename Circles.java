import java.util.Scanner;

public class Circles extends Shapes{
  //Intializing static variables.
  private static double radius;
  //Constructor
  Circles(double radius){
    super(0);
    this.radius = radius;
  }
  //Finding Area and perimeter.
  static void area(){
    System.out.println("Area: " + Math.PI * Math.pow(radius, 2)); 
  }

  static void perimeter(){
    System.out.println("Perimeter: " + 2 * Math.PI * radius);
  }
  
  //getters and setters
  static void getFields(){
    System.out.println("Radius: radius");
  }

  static void setFields(){
    Scanner console = new Scanner(System.in);
    System.out.print("Set Radius: ");
    radius = console.nextDouble();
    System.out.println("\nSuccessfully modified!");
    console.close();
  }



}