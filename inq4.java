class employee{
void work(){
System.out.println("emp is working");
}
 void getsalary(){
System.out.println("60000");
}}
class HR extends employee{
void work(){
System.out.println("work is done!!");
}
void addemp(String a){
System.out.println("new emp added"+" "+ a);
}
public static void main(String []s){
HR obj= new HR();
obj.work();
obj.getsalary();
obj.addemp("joe");
}
}
/*OUTPUT
work is done!!
60000
new emp added joe
*/
