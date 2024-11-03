class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        person.setCountry("USA");

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Country: " + person.getCountry());
    }
}

/*
Output:
Name: Alice, Age: 30, Country: USA
*/
