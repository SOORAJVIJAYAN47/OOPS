import java.util.*;
class Employeee
{
int empid;
String name;
double salary;
String address;
Employeee()
{
Scanner sc2=new Scanner(System.in);
System.out.println("entyer employee id");
empid=sc2.nextInt();
System.out.println("enter the employee name");
name=sc2.next();
System.out.println("enter the employee salary");
salary=sc2.nextDouble();
System.out.println("enter the employee address");
address=sc2.next();
}
}
class Teacher extends Employeee
{
String department;
String subject;
Teacher()
{
Scanner sc3=new Scanner(System.in);
System.out.println("enter department");
department=sc3.next();
System.out.println("enter subject");
subject=sc3.next();
}
void display()
{
System.out.println("............................");
System.out.println("id"+empid);
System.out.println("NAME"+name);
System.out.println("SALARY"+salary);
System.out.println("ADDRESS"+address);
System.out.println("DEPARTMENT"+department);
System.out.println("SUBJECT"+subject);
System.out.println("..............................");
}
}
class multilevelinheritance
{
public static void main(String args[])
{
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the no of employees");
n=sc1.nextInt();
Teacher t[]=new Teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println(".................");
System.out.println(".................");
System.out.println("THE DETAIL ARE....");
System.out.println("...................");
for(int i=0;i<n;i++)
{
t[i].display();
}
}
}

