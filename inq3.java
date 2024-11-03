class shape{
void getarea(){
System.out.println("!!");
}
}
class shape2 extends shape{
 void getarea(){
int l=2;
int b=3;
int area=l*b;
System.out.println("the area of rectangle is"+" "+ area);
}
public static void main(String arg[]){
shape2 obj=new shape2();
obj.getarea();
}
}
/*OUTPUT
the area of rectangle is 6
*/