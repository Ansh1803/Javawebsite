class animal{
void makesound(){
System.out.println("makes a sound");
    }
}
class cat extends animal{
void makesound(){
System.out.println("cats barks");
 }
}
 class main{
public static void main(String [] s){
animal myanimal= new animal();
cat mycat= new cat();
myanimal.makesound();
mycat.makesound();
}
}
/*OUTPUT
makes a sound
cats barks
*/