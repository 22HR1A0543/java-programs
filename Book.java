class Author{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;
Book(String n,int p,Author auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String[]args){
Author auther=new Author("jhon",42,"usa");
Book b=new Book("CORE JAVA",800,auther);
System.out.println("bookname="+b.name);
System.out.println("bookprice="+b.price);
System.out.println("=====auhtor details======");
System.out.println("auther name="+b.auther.authorName);
System.out.println("auther age:"+b.auther.age);
System.out.println("auther place:"+b.auther.place);
}
}