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

public int getHours(){
Date d1=new Date();
return d1.getHours();
}

public static void main(String st[]){
current obj= new current();
current obj2= new current();
current obj3= new current();
current obj5= new current();


System.out.println("Date="+obj.getDate()+"-"+obj2.getMonth()+"-"+obj3.getYear());

System.out.println("Time="+obj5.getHours());
}
}
/*OUTPUT
Date=18-8-2024
Time=21
*/