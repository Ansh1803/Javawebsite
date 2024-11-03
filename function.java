class A {
    
    void S() {
        int a = 5;
        int b = 3;
        int c = 1;

        
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
               A obj = new A();
System.out.println("smallest number is");        
               obj.S();
}
}
/*OUTPUT
  smallest number is
1
 */
