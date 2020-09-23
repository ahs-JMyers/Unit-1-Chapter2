/*
 *Joshua Myers
 *Programming III AP CS A
 *Project
 *Date
*/


import java.util.Scanner;
public class wordGame {
    
public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    //Declare variables
    String name;
    int age;
    String city;
    String college;
    String profession;
    String animal;
    String petName;
    //user input
    System.out.println("Please Enter your name.");
    name = keyboard.next();
    
    System.out.println("Please Enter your age.");
    age = keyboard.nextInt();
    
    System.out.println("Please enter the city that you live in.");
    city =keyboard.next();
    
    System.out.println("Please enter the college that you are currently "
            + "attending");
    college = keyboard.next();
    
    System.out.println("Please enter in your profession.");
    profession = keyboard.next();
    
    System.out.println("Please enter in the animals that you own.");
    animal = keyboard.next();
    
    System.out.println("Please enter in your pets name.");
    petName = keyboard.next();
    
    //output
    System.out.println("There once was a person named " + name + " who lived in "
    + city + ". At the age of " + age + ", ");
    System.out.println(name + " went to college at " + college + ". " + name
    + " graduated and went to work as a");
    System.out.println(profession + ". Then, " + name + " adopted a(n) "
    + animal + " named " + petName + "." + " They both lived");
    System.out.println("happily ever after!");
}
}
