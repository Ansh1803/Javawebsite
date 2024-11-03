import java.util.Date;
class current{
public int getDate(){
Date d1=new Date();

return d1.getDate();
}
public int getYear(){

Date d1=new Date();
return d1.getYear()+1900;
}
public int getMonth(){

Date d1=new Date();
return d1.getMonth();
}
public static void main(String st[]){
current obj= new current();
current obj2= new current();
current obj3= new current();

System.out.println("Date="+obj.getDate());
System.out.println("Month="+obj2.getMonth());
System.out.println("Year="+obj3.getYear());
}
}
/*OUTPUT
Date=18
Month=8
Year=2024*/