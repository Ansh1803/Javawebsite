class DefaultConstructor {
    private int number;

    public DefaultConstructor() {
        this.number = 10;
    }

    public void displayNumber() {
        System.out.println("Number: " + number);
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.displayNumber();
    }
}

/*
Output:
Number: 10
*/
