import java.util.*;
class bindeci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double m,d=0;
int i=0;

System.out.println("enter the number ");
{
long n=sc.nextLong();
while(n>0)
{
m=(n%10)*Math.pow(2,i);
d=d+m;
i++;
n=n/10;
}
System.out.println(" number is"+d);
}
}
}

