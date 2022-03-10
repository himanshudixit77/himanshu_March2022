import java.util.*;
class decibin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double num=0;
int i=0;
long r;

System.out.println("enter the number ");
{
long n=sc.nextLong();
while(n>0)
{
	r=n%2;
double c=Math.pow(10,i);
num=num+(r*c);
n=n/2;
i++;
}
System.out.println(" number is"+num);
}
}
}