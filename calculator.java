import java.util.*;
class calculator
{
public static void main(String[] args)
{
int n,a,b,c,ch;
Scanner cal=new Scanner(System.in);
System.out.println("enter the  numbers");
a=cal.nextInt();
b=cal.nextInt();
System.out.println("enter your choice");
ch=cal.nextInt();
switch(ch)
{
case 1:
c=a+b;
System.out.println(" the sum is" +c);
break;
case 2:
c=a-b;
System.out.println(" the difference is" +c);
break;
case 3:
c=a*b;
System.out.println(" the product is" +c);
break;
case 4:
c=a/b;
System.out.println(" the reminder is" +c);
break;
default:
System.out.println("Wrong choice");
}
}
}

