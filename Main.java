import java.util.*;

class Main {
  public static void main(String[] args) {
    //Testing

    /*
    Shapes circle = new Circles(7);
    Circles.area();
    Circles.perimeter();
    Circles.getFields();
    Circles.setFields();
    Circles.area();
    Circles.perimeter();
    
    Shapes quadrilateral = new Quads(4, 4);
    Quads.area();
    Quads.perimeter();
    Quads.getFields();
    Quads.setFields();
    Quads.area();
    Quads.perimeter();

    */
    Shapes triangle = new Triangles(3, 4, 5);
    Triangles.area();
    Triangles.perimeter();
    Triangles.getFields();
    Triangles.setFields();
    Triangles.area();
    Triangles.perimeter();




  }
}

/*
    Scanner console = new Scanner(System.in);
    System.out.print("\nOffered Shapes:\n\n1. Circles/Cone/Cylinder\n2. Triangles\n3. Quadrilaterals\n4. Three Dimensional\n\n* Please select a number corresponding to the shape to open a menu for the given shape: ");
    
    int prompt = console.nextInt();
    String prompt2;

    if (prompt == 1){
      System.out.println("Which of the three? ");
      prompt2 = console.next();
      if (prompt2.equalsIgnoreCase("Circle")){

      }
      else if (prompt2.equalsIgnoreCase("Cone")){

      }
      else if (prompt2.equalsIgnoreCase("Cylinder")){

      }
      else{
        System.out.println("Sorry, but the input is invalid or does not match our options.");
      }
    }
    else{
      System.out.println("\n!!! Sorry, but given number does not reflect our choices. Please try again!");
    }
*/