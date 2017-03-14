

public class Rectangle {
    double width = 0;
    double height = 0;
    
    public Rectangle(double width, double height){
        assert(width >= 0);
        assert(height >= 0);
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
