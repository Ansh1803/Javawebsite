class ParameterizedConstructor {
    private String message;

    public ParameterizedConstructor(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Hello, World!");
        obj.displayMessage();
    }
}

/*
Output:
Message: Hello, World!
*/
