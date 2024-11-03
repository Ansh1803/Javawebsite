import java.util.Date;
class current2 extends java.util.Date{

public int getYear(){

java.util.Date d1=new java.util.Date();
return d1.getYear()+1900;
}

public static void main(String st[]){
current2 obj= new current2();
current2 obj2= new current2();
current2 obj3= new current2();

System.out.println("Date="+obj.getDate());
System.out.println("Month="+obj2.getMonth());
System.out.println("Year="+obj3.getYear());
}
}