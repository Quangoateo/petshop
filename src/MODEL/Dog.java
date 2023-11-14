/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author TG
 */
public class Dog extends Pet{

    public Dog(String name, String breed, int age, double price) {
        super(name, breed, age, price);
    }
    
    @Override
    public String getDescription() {
        return "This is a dog. It's a loyal and friendly pet." +
               "\nName: " + getName() +
               "\nBreed: " + getBreed() +
               "\nAge: " + getAge() +
               "\nPrice: $" + getPrice();
    }
    
    @Override
    public String getDetails(String parameter) {
        String output;
        switch(parameter) {
            case "Species":
                output = "This is a dog. It's a loyal and friendly pet.";
                break;
            case "Name":
                output = "Name: " + getName();
                break;
            case "Breed":
                output = "Breed: " + getBreed();
                break;
            case "Age":
                output = "Age: " + getAge();
                break;
            case "Price":
                output = "Price: " + getPrice();
                break;
            default:
                output = "No valid parameter inputted!";
        }
        return output;
    }
}
