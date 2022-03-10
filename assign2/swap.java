import java.util.*;
class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);


double a=sc.nextDouble();
double b=sc.nextDouble();
System.out.println("value of a " +a);
System.out.println("value of b " +b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("value of a after" +a);
System.out.println("value of b after" +b);
}
}