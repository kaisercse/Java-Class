import java.util.Scanner;
public class Sum
{
public static void main(String[]arg)
{
Scanner in =new Scanner(System.in);
int sum=0;
System.out.println("Please Enter Your Number");
int a = in.nextInt(); 
for (int i=1;i<=a;i++)
{
sum=sum+i;
}
System.out.println("You entered integer "+a); 
System.out.println("Series of number " +sum); 


}
}