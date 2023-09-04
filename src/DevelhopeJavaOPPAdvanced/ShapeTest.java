package DevelhopeJavaOPPAdvanced;

public class ShapeTest {
    public static void main( String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(24.66);
        Shape shape3 = new Shape(4, 3.4);
        Shape shape4 = new Shape(3, 5.6, 4.5);
        Shape shape5 = new Shape(4, 2.4, 2.5, 2.6);
        String noName = shape1.getShapeDetails();
        String circle = shape2.getShapeDetails();
        String square = shape3.getShapeDetails();
        String triangle = shape4.getShapeDetails();
        String rectangle = shape5.getShapeDetails();
        System.out.println("noName: "+ noName + "Circle: "+ circle+ "Square: " + square + "rectangle: " + triangle + "triangle: " + rectangle);
    }
}
