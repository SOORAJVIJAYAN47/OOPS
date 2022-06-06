import java.util.*;
class Areas
{
void calculateArea(float x)
{
System.out.println("Area of the square:"+x*x+"sq units");
}
void calculateArea(float x,float y)
{
System.out.println("Area of rectangle:"+x*y+" sq units");
}
void calculateArea(double r)
{
double area=3.14*r*r;
System.out.println("Area of circvle:"+area+"sq units");
}
public static void main(String args[])
{
int s;
float l,b;
double r;
Areas obj=new Areas();
Scanner sc=new Scanner(System.in);
System.out.println("enter side of square");
s=sc.nextInt();
System.out.println("Enter the length and breadth of a rectangle");
l=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter the radius of the circle");
r=sc.nextDouble();
obj.calculateArea(s);
obj.calculateArea(l,b);
obj.calculateArea(r);
}
} 