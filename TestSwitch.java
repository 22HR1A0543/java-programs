import java.io.*;
import java.util.*;
class TestSwitch
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String month;
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

default:
System.out.println("enter valid choice:");
}
}
}