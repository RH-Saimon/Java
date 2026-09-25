abstract class Shape{
    String name;

    public Shape(String name){
        this.name = name;
    }
    abstract double area();

    void displayInfo(){
        System.out.println(name + " area:" + area());
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        super("Circle");

        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;   
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    @Override
    double area(){
        return width * height;
    }
}
class Abstract{
    public static void main(String[] args) {
        Shape s = new Circle(4);
        Shape s1 = new Rectangle(2,3 );

        s.displayInfo();
        s1.displayInfo();
    
    }
}

