import java.io.*;
import java.util.*;
class TestSwitch
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String day;
switch(a)
{
case 0:
{
month="SUNDAY";
System.out.println(month);
break;
}
case 1:
{
month="MONDAY";
System.out.println(month);
break;
}
case 2:
{
month="TUESDAY";
System.out.println(month);
break;
}
case 3:
{
month="WEDNESDAY";
System.out.println(month);
break;
}
case 4:
{
month="THURSDAY";
System.out.println(month);
break;
}
case 5:
{
month="FRIDAY";
System.out.println(month);
break;
}
case 6:
{
month="SATURDAY";
System.out.println(month);
break;
}
case 7:
{
month="august";
System.out.println(month);
break;
}
/*case 8:
{
month="sep";
System.out.println(month);
break;
}
case 9:
{
month="oct";
System.out.println(month);
break;
}
case 10:
{
month="nov";
System.out.println(month);
break;
}
case 11:
{
month="dec";
System.out.println(month);
break;
}*/
default:
System.out.println("enter valid choice:");
}
}
}