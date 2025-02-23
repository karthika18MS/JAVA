import java.util.Scanner;
class Product
{
public static void main(String[]args)
{
Scanner Obj=new Scanner(System.in);
Scanner Obj1=new Scanner(System.in);
Scanner Obj2=new Scanner(System.in);
System.out.println("Enter the product code");
String pcode=Obj.nextLine();
System.out.println("Enter the product name");
String pname=Obj.nextLine();
System.out.println("Enter the product price");
int price=Obj.nextInt();
System.out.println("product code"+pcode);
System.out.println("product name"+pname);
System.out.println("product price"+price);

System.out.println("enter Product code");
String pcode1=Obj1.nextLine();
System.out.println("Enter the product name");
String pname1=Obj1.nextLine();
System.out.println("Enter the product price");
int price1=Obj1.nextInt();

System.out.println("product code"+pcode1);
System.out.println("product name"+pname1);
System.out.println("product price"+price1);

System.out.println("enter Product code");
String pcode2=Obj2.nextLine();
System.out.println("Enter the product name");
String pname2=Obj2.nextLine();
System.out.println("Enter the product price");
int price2=Obj2.nextInt();

System.out.println("product code"+pcode2);
System.out.println("product name"+pname2);
System.out.println("product price"+price2);

if(price<price1 && price<price2)
{
System.out.println("product price is lowest");
}
else if(price1<price && price1<price2)
{
System.out.println("product price1 is lowest");
}
else
{
System.out.println("product price2 is lowest");
}
}
}
