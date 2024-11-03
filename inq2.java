class Vehicle{
void drive(){
System.out.println("Driving a car");
    }
}
class Car extends Vehicle{
void drive(){
System.out.println("Repairing a car");
 }
}
 class main{
public static void main(String [] s){
Vehicle myVehicle = new Vehicle();
myVehicle.drive(); 

       
Car myCar = new Car();
myCar.drive();
}
}
/*OUTPUT
Driving a car
Repairing a car
*/