
interface shape {
 void getArea();
    
}

 class Rectangle implements shape {
   public void getArea(){
    int w=5;
int h=5;    
int area=w*h;
System.out.println(area);
}
 class Triangle {
    public void getArea(){
int b=10;
int height=20;
int area=(b*height)/2;
System.out.println(area);
    }  
}
class circle{
public void getArea(){
    int r=5;
    float Area=(float)(3.14)*r*r;
    System.out.println(Area);
}

}

    
}