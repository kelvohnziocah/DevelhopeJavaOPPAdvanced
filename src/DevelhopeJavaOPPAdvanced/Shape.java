package DevelhopeJavaOPPAdvanced;

public class Shape {
    private String shapeName;
    private int numberOfEdges;
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }
    public String getShapeName() {
        return shapeName;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }
    public Shape(){
        System.out.println("***The Shape constructor is created***");
        shapeName =  "undefined Shape";
    }
    public Shape(double radius){
        System.out.println("***Cirle overload constructor created***");
        shapeName = "Cirle";
        numberOfEdges = 0;
    }
    public Shape(int edges, double edgeLength){
        shapeName = "Square";
        System.out.println("***Square overload constructor created***");
    }
    public Shape(int edges, double e1, double e2){
        this.numberOfEdges = edges;
        shapeName = "rectangle";
        System.out.println("***Rectangle overload constructor created***");
    }
    public Shape(int edges, double e1, double e2, double e3){
        this.numberOfEdges = edges;
        shapeName = "Triangle";
        System.out.println("***Triangle overload constructor created***");
    }
    public String getShapeDetails(){
        return String.format("The Shape is: %s%n Number of Edges: %d ", getShapeName(), getNumberOfEdges());
    }
}
