import java.util.*;
class rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

double l=sc.nextDouble();
double b=sc.nextDouble();

double area=l*b;
double per=2*(l+b);
System.out.println("perimeter is" +per);
System.out.println("area is" +area);
}
}