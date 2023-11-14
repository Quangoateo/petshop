/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author TG
 */
public class Cat extends Pet {

    public Cat(String name, String breed, int age, double price) {
        super(name, breed, age, price);
    }
    
    @Override
    public String getDescription() {
        return "Name: " + getName() +
               ", Breed: " + getBreed() +
               ", Age: " + getAge() +
               ", Price: $" + getPrice();
    }
    
    @Override
    public String getDetails(String parameter) {
        String output;
        switch(parameter) {
            case "Species":
                output = "This is a cat. It's an independent and playful pet.";
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
