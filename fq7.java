class a{
void password(String a){
String pass="pggc11";
if(a==pass){
System.out.println("password is vaild");
}
else{
System.out.println("invalid");
}
}
public static void main(String s[]){
a obj=new a();
obj.password("pggc1");
}
}
/*OUTPUT
invalid
*/

