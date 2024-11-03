
 interface animal {
    void bark();
}
 class dog implements animal {
   public void bark(){
        System.out.println("dog is barking");
    }
    public static void main(String st[] ){
        dog obj=new dog();
        obj.bark();
    }


    
}
/*OUTPUT
dog is barking
*/