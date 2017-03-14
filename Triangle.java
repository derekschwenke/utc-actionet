

public class Triangle implements Shape {
    double a = 0;
    double b = 0;
    double c = 0;
    
    public Triangle(double a, double b, double c){
        assert(a >= 0);
        assert(b >= 0);
        assert(c >= 0);
        double max = Math.max(Math.max(a,b),c);
        assert((a + b + c - max) > max); // Triangle can close
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getArea() {
        return 0.25 * Math.sqrt((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c)); // source: wolframalpha.com 
    }
    
    public double getPerimeter() {
        return a+b+c;
    }
}
