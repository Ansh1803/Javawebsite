class middle{
String middle(String a){
int l=a.length();
int middle=l/2;

if(l%2==0){
return a.substring(middle-1,middle+1);
}
else{
return a.substring(middle,middle+1);
}
}
public static void main(String [] s){
String a="pggc11";
middle obj=new middle();
System.out.println("The middle character:"+" "+ obj.middle(a));

}

}
/*output
The middle character: gc
*/
