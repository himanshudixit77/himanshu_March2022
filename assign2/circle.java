
import java.util.*;
class circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

double rad=sc.nextDouble();
double per= (2*rad*(22.0/7));
double area=((22.0/7)*rad*rad);
System.out.println("perimeter is" +per);
System.out.println("area is" +area);
}
}