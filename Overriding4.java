/*Assignment 4:
Create a parent class Vehicle with a method speed() that prints "Speed varies for different vehicles."
Create subclasses:
Car that overrides speed() to print "The car speed is 120 km/h."
Bike that overrides speed() to print "The bike speed is 80 km/h."
Use polymorphism to display the speed of different vehicles in the Main class. */

class Vehicle{
 void  speed(){
    System.out.println("Speed varies for diffrent vehicles ");
  }
}

class Car extends Vehicle{
 void speed(){
        System.out.println("The car speed is 120 km/h.");
      }

}

class Bike extends Vehicle{
   void  speed(){
        System.out.println("The bike speed is 80 km/h.");
      }

}
public class Overriding4 {
    public static void main(String[] args) {
        
   Vehicle v = new Car();
   v.speed();
   v = new Bike();
   v.speed();

   Vehicle arr[] = new Vehicle[2];
   arr[0] = new Car();
   arr[1] = new Bike();
   for(int i=0; i<arr.length; i++){
//System.out.println(arr[i].speed());
arr[i].speed();
}
/* 
for(Vehicle s : arr){
System.out.println(s.speed());
}
*/


    }  
}
