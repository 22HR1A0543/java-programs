import java.io.*;
import java.util.*;
class TestSwitchMonth
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String month;
switch(a)
{
/*case 0:
{
month="SUNDAY";
System.out.println(month);
break;
}*/
case 1:
{
month="jan";
System.out.println(month);
break;
}
case 2:
{
month="feb";
System.out.println(month);
break;
}
case 3:
{
month="march";
System.out.println(month);
break;
}
case 4:
{
month="april";
System.out.println(month);
break;
}
case 5:
{
month="may";
System.out.println(month);
break;
}
case 6:
{
month="june";
System.out.println(month);
break;
}
case 7:
{
month="july";
System.out.println(month);
break;
}
case 8:
{
month="august";
System.out.println(month);
break;
}
case 9:
{
month="sep";
System.out.println(month);
break;
}
case 10:
{
month="oct";
System.out.println(month);
break;
}
case 11:
{
month="nov";
System.out.println(month);
break;
}
case 12:
{
month="dec";
System.out.println(month);
break;
}
default:
System.out.println("enter valid choice:");
}
}
}