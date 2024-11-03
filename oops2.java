class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

public class DogExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Beagle");

        dog1.setName("Charlie");
        dog2.setBreed("Bulldog");

        dog1.displayInfo();
        dog2.displayInfo();
    }
}

/*
Output:
Name: Charlie, Breed: Golden Retriever
Name: Max, Breed: Bulldog
*/
