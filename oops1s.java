class person{
    String name;
    int age;
    
    person(String n,int a){
    name=n;
    age=a;
    }
    void getdisplay(){
    System.out.println(name);
    System.out.println(age);
    }
    public static void main(String s[]){
    person obj= new person("person",30);
    obj.getdisplay();
    
    }
    
    
    }