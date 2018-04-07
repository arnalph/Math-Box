/**
 * Math-box is a simple math functions library designed to process basic math formulae.
 * @author Arnav M. Kamath
 * @version 0.0.1
 */
public class Mathbox
{
    public int Area(int l, int b)//Area of rectangle
    {
        int area = l*b;
        return area;
    }
    public double Area(int a, int b, int c)
    {
        int s = (a+b+c)/2;
        int h = s*((s-a)*(s-b)*(s-c));//Heron's Formula
        double area = Math.sqrt(h);
        return area;
    }
    public double CompoundI(int p,int r,int t)//Compound Interest
    {
        double intr = Math.pow((p/r+1),t);
        return intr;
    }
    public int SimpleI(int p,int r,int t)//Simple Interest
    {
        int interest = (p*r*t)/100;
        interest = interest + p;
        return interest;
    }
    public double Area(int r)//Area of Circle
    {
        double area = 2*(22/7)*(r*r);
        return area;
    }
    public double Pythogras(int a, int b)//Pythogras Theorem
    {
        a = a*a;
        b = b*b;
        double c = Math.sqrt(a + b);
        return c;
    }
}
