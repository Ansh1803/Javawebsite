class c{
void finder(char s,char e){
if (s>e){
System.out.println("invalid");
}
for(char ch=s;ch<=e;ch++){
System.out.println(ch);
}
}
public static void main(String [] s){
c obj=new c();
obj.finder('A','K');
}
}
/*OUTPUT
A
B
C
D
E
F
G
H
I
J
K*/