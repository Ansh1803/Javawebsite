class CopyConstructor {
    private int value;

    public CopyConstructor(int value) {
        this.value = value;
    }

    public CopyConstructor(CopyConstructor obj) {
        this.value = obj.value;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(100);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.displayValue();
        obj2.displayValue();
    }
}

/*
Output:
Value: 100
Value: 100
*/
