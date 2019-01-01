public class GeometricObject
{
    double side1=1.0;
    double side2=1.0;
    double side3=1.0;

    public GeometricObject()
    {
        new Triangle();
    }

    public double getSide1()
    {
        return this.side1;
    }

    public double getSide2()

    {
        return this.side2;
    }

    public double getSide3()

    {
        return this.side3;
    }

    public GeometricObject(double side1NewConstructor, double side2NewConstructor, double side3NewConstructor)
    {
        this.side1=side1NewConstructor;
        this.side2=side2NewConstructor;
        this.side3=side3NewConstructor;
        new Triangle();
    }

    public double getArea()
    {
        return side1*side2;
    }

    public double Getperimeter()
    {
        return side1+side2+side3;


    }

    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }








}
