package Graphics;
import java.io.*;
import java.util.*;
public class Rectangle1
{
int l,b;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.println("enter the length and breadth");
l=sc.nextInt();
b=sc.nextInt();

}
public void area()
{
System.out.println("Area of rectangle:"+(l*b));
}
}

