import java.util.*;
public class Numeric
{
public static void main(String[] args)
{
String w;
Scanner q=new Scanner(System.in);
w=q.nextLine();
for(int i=0;i<w.length();i++)
{
if(w[i]==1&&w[i]==2&&w[i]==3&&w[i]==4&&w[i]==5&&w[i]==6&&w[i]==7&&w[i]==8&&w[i]==9)
{
System.out.println("No");
}
else
{
System.out.println("Yes");
}
}
}
}
