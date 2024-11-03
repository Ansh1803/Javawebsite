class Dog {
String name;
 String breed;

  public Dog(String name, String breed) {
       
       this.name = name;  
        this.breed = breed;
       
    }

  
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    
    public void setName(String name) {
        
        this.name = name; 
    }

    public void setBreed(String breed) {
        this.breed = breed; 
    }

 public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
   Dog dog1 = new Dog("rax","streetdog");
        Dog dog2 = new Dog("Max", "Bulldog");

        
        System.out.println("Initial values:");
        dog1.displayInfo();
        dog2.displayInfo();

       
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Poodle");

        
        System.out.println("\nUpdated values:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
/*OUTPUT
Initial values:
Dog Name: rax, Breed: Streetdog
Dog Name: Max, Breed: Bulldog

Updated values:
Dog Name: Charlie, Breed: Labrador
Dog Name: Rocky, Breed: Poodle
*/
