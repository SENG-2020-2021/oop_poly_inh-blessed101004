import java.util.Scanner;
//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
    //Declare a char to store the chosen quadilateral
    char Parallelogram;
    char Trapezoid;
    char Square;
    char Rectangle;

    //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral
    System.out.println("This program is for checking the desired area of any quadilateral");
    System.out.println(" p for Parallelogram,t for Trapezoid, s for square and g for rectangle");
    Scanner scan= new Scanner(System.in);
    char quadilateral= scan.next().charAt(0);
    switch (quadilateral) {
      case 'p':


    //this should be in the parallelogram case
    System.out.println("This program calculates the area and perimeter of the parallelogram.");
    System.out.println("Input the base of your Parallelogram");
    Scanner scan = new Scanner(System.in);
    float pBase = scan.nextFloat();
    System.out.println("Input the height of your Parallelogram");
    float pHeight = scan.nextFloat();
    Parallelogram p = new Parallelogram(pBase, pHeight);
    
    Quadilateral q = p;

  
    System.out.println("Input the dimension of the first pair of your Parallelogram");
    q.setLength(scan.nextFloat());
    System.out.println("Input the second pair of your Parallelogram");
    q.setBreadth(scan.nextFloat());
    
    System.out.printf("The area of the parallelogram with base: %.2f and height: %.2f is: %.2f", pBase, pHeight, p.Area());

    System.out.println("");
    System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
    System.out.println("");
    System.out.println("");
    System.out.println("");

    //this should be in the Trapezoid case
    case 't':
     System.out.println("Calculation for a Trapezoid");
     System.out.println("Input first side");
     float a = scan.nextFloat();
     System.out.println("Input second side");
     float b = scan.nextFloat();
     System.out.println("Input third side");
     float c = scan.nextFloat();
     System.out.println("Input fourth side");
     float d = scan.nextFloat();
     Trapezoid t = new Trapezoid(a, b, c, d);
    System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f", a, b, c, d,t.calculatePerimeter()); 
    System.out.println("");
    System.out.println("");
    System.out.println("");

    // for the rhombus:
    case 'r':
    System.out.println("Calculation of rhombus");
    System.out.println("Input value for the first diagonal");
    float diagonal1 = scan.nextFloat();
    System.out.println("Input the value for the second diagonal");
    float diagonal2 = scan.nextFloat();
    Rhombus rhombus = new Rhombus(diagonal1,diagonal2);

    Quadilateral R = rhombus;

    System.out.println("Input the length of the rhombus");
    R.setLength(scan.nextFloat());
    System.out.println("Input the breadth of your rhombus");
    R.setBreadth(scan.nextFloat());
    System.out.printf("The area of the rhombus with a first diagonal: %.2f, and second diagonal: %.2f is %.2f",diagonal1,diagonal2,rhombus.areaOfRhombus());
    System.out.println();
    System.out.printf("The perimeter of the Rhombus with length: %.2f and breadth: %.2f is %.2f",R.getLength(),R.getLength(),R.calculatePerimeter());
    System.out.println("");
    System.out.println("");
            
   //  for the square:  
   case 's' :    
   System.out.println("Calculation of square");
   System.out.println("Input the side of the square");
   float sLength = scan.nextInt();
   Square square = new Square(sLength);

   Quadilateral S = square;

   System.out.println("Input the length of the square");
   S.setLength(scan.nextFloat());
   System.out.println("Input the breadth of the square");
   S.setBreadth(scan.nextFloat());
   System.out.printf("The area of the square with side: %.2f is %.2f",sLength,square.areaOfSquare());
   System.out.println();
   System.out.printf("The perimeter of a square with length: %.2f and breadth: %.2f is %.2f",S.getLength(),S.getBreadth(),S.calculatePerimeter());
   System.out.println("");
   System.out.println("");

   // for the rectangle:
   case 'g':
   System.out.println("Calculation of rectangle");
   System.out.println("Input the length of the rectangle");
   float rLength = scan.nextFloat();
   System.out.println("Input the width of the rectangle");
   float rWidth = scan.nextFloat();
   Rectangle rectangle = new Rectangle(rLength,rWidth);

   System.out.println("Input the length of your rectangle");
   float RLength = scan.nextFloat();
   System.out.println("Input the width of your rectangle");
   float RWidth = scan.nextFloat();

   Rectangle r = new Rectangle(RLength,RWidth);
            
   System.out.printf("The area of a rectangle with length: %.2f and width: %.2f is %.2f",rLength,rWidth,rectangle.areaOfRectangle());
   System.out.println();
   System.out.printf("The perimeter of a rectangle with length: %.2f and width: %.2f is: %.2f",RLength,RWidth,r.perimeterOfRectangle());
  }
}

//Create class for Rhombus
 class Rhombus extends Quadilateral{
 private float firstDiagonal;
 private float secondDiagonal;
 public Rhombus(float d1,float d2){
   firstDiagonal=d1;
   secondDiagonal=d2;
  }
  public float areaOfRhombus(){
   return (firstDiagonal*secondDiagonal)/2;
  }
}

//Create class for square
   class Square extends Quadilateral{
   private float l;
   public Square(float length){
   l=length;
  }
  public float areaOfSquare(){
   return l*l;
  }
}

//create class for Rectangle
 class Rectangle extends Quadilateral{
 private float l;
 private float w;
 public Rectangle(float length, float width){
   l=length;
   w=width;
  }
  public float perimeterOfRectangle(){
   return 2*(l+w);
  }
  public float areaOfRectangle(){
   return l*w;
  }
}


class Trapezoid extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  public Trapezoid (float a, float b, float c, float d){
    side1 = a;
    side2 = b;
    side3 = c;
    side4 = d;
  }

  public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }
}
class Parallelogram extends Quadilateral{
  private float base;
  private float height;
  public Parallelogram (float b, float h){
    if (b <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
      base = 1;
    }
    else
      base = b;
    if (h <= 0){
      System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
      height = 1;
    }
    else
      height = h;
  }
  public float Area(){
    return base*height;
  }

}
class Quadilateral {
  private float length;
  private float breadth;

  public void setLength(float l){
    length = l;
  }

  public float getLength(){
    return length;
  }

  public void setBreadth(float b){
    breadth = b;
  }

  public float getBreadth(){
    return breadth;
  }

  public float calculatePerimeter(){
    return 2*(length+breadth);
  }
 }
}