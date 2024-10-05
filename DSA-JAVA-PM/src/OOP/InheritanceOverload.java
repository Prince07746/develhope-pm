package OOP;

public class InheritanceOverload {
     public static void main(String[] args){

         // Creating a default shape (undefined)
         Shape shape1 = new Shape();
         String shape1Info = shape1.getShapeDetails();
         // Creating a circle with a radius
         Shape shape2 = new Shape(5.0); // Circle with radius 5.0
         String shape2Info = shape2.getShapeDetails();
         // Creating a square with 4 edges and an edge length of 3.0
         Shape shape3 = new Shape(4, 3.0); // Square with edge length 3.0
         String shape3Info = shape3.getShapeDetails();
         // Creating a rectangle with 4 edges, length 5.0, and width 3.0
         Shape shape4 = new Shape(4, 5.0, 3.0); // Rectangle with length 5.0 and width 3.0
         String shape4Info = shape4.getShapeDetails();
         // Creating a triangle with 3 edges and side lengths 3.0, 4.0, and 5.0
         Shape shape5 = new Shape(3, 3.0, 4.0, 5.0); // Triangle with sides 3.0, 4.0, 5.0
         String shape5Info = shape5.getShapeDetails();


         System.out.println(shape1Info);
         System.out.println(shape2Info);
         System.out.println(shape3Info);
         System.out.println(shape4Info);
         System.out.println(shape5Info);
     }
}

//an instance variable shapeName
//an instance variable numberOfEdges
//1 basic constructor method with no params that
//informs the user about the Shape object creation
//assign Undefined shape to the object's shapeName
//        4 params overload constructor methods: for circle:
//takes a double radius param
//informs the user about the object creation
//assigns the shapeName for square:
//takes an int edges param and a double edgeLength param
//informs the user about the object creation
//assigns the values to numberOfEdges and to shapeName for rectangle:
//takes an int edges param and 2 double (e1, e2) params
//informs the user about the object creation
//assigns the values to numberOfEdges and to shapeName for triangle:
//takes an int edges param and 3 double (e1, e2, e3) params
//informs the user about the object creation
//assigns the values to numberOfEdges and to shapeName

class Shape {
    String shapeName;
    int numberOfEdges;

    // Default constructor with no parameters
    public Shape() {
        System.out.println("A shape object has been created.");
        this.shapeName = "Undefined";
    }

    // Constructor for a circle (1 parameter: radius)
    public Shape(double radius) {
        System.out.println("A Circle has been created.");
        this.shapeName = "Circle";
        this.numberOfEdges = 0; // Circle has no edges
    }

    // Constructor for a square (2 parameters: edges and edgeLength)
    public Shape(int edges, double edgeLength) {
        System.out.println("A Square has been created.");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }

    // Constructor for a rectangle (3 parameters: edges, e1, e2)
    public Shape(int edges, double e1, double e2) {
        System.out.println("A Rectangle has been created.");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
    }

    // Constructor for a triangle (4 parameters: edges, e1, e2, e3)
    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("A Triangle has been created.");
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
    }
    public String getShapeDetails(){
        return "Shape: "+shapeName+" number of edges: "+numberOfEdges;
    }
}
