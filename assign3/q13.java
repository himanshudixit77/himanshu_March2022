class q13
{
public static void main(String args[])
{
char i,j,k; int sp=1;
for(i='A';i<='E';i++)
{
  for(k=4;k>=sp;k--)
  {
  System.out.print(" ");
  sp++;
  }
  for(j='A';j<=i;j++)
   {
    System.out.print(i+" ");
}

System.out.println();
}}}