

public class Circle implements Shape {
     double radius = 0;
     
     public Circle(double radius){
          assert(radius >= 0);
          this.radius = radius;
     }
     
     public double getArea() {
          return Math.PI * radius * radius;
     }
     
     public double getPerimeter() {
          return 2 * Math.PI * radius;
     }
}
