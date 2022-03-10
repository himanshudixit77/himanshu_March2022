class q9
{
public static void main(String args[])
{
char i,j,k,sp=1;
for(i='A';i<='E';i++)
{
  for(k=4;k>=sp;k--)
  {
  System.out.print(" ");
  sp++;
  }
  for(j='A';j<=i;j++)
   {
    System.out.print(j+" ");
}

System.out.println();
}}}