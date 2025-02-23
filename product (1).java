import java.util.Scanner;
class product1
{
int pcode ;
String pname;
int price;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter product details");
pcode=sc.nextInt();
pname=sc.next();
price=sc.nextInt();
}
}
public class product
{
public static void main(String[] args){
product1 sc=new product1();
product1 sc1=new product1();
product1 sc2=new product1();

sc.get();
sc1.get();
sc2.get();

if(sc.price<sc1.price && sc.price<sc2.price)
{
System.out.println("First object has lowest price "+sc.price);
}
else if(sc1.price<sc.price && sc1.price<sc2.price)
{
System.out.println("Second object has lowest price "+sc1.price);
}
if(sc2.price<sc.price && sc2.price<sc1.price)
{
System.out.println("Third object has lowest price "+sc2.price);
}
}
}


