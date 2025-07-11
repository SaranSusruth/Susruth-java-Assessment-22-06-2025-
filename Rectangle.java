public class Rectangle implements Shape
{
    private double width;
    private double  height;
    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double area()
    {
        return width * height;   
    }
    public double perimeter()
    {
        return 2 * (width + height);
    }
    public String getName()
    {
        return "Rectangle";
    }
}
