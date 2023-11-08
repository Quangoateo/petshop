package CONTROLLER;

public class Pet {
    private String name;
    private String breed;
    private int age;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // Method to get a description of the pet and its breed
    public void getDescription() {
        // Implement your logic to provide a description of the pet and its breed
        System.out.print("NAME:"+name);
        System.out.print("BREED:"+breed);
        System.out.print("AGE:"+age);
        System.out.print("Price:"+price);
        // Return a placeholder description for demonstration purposes
        // Change this as needed
    }
}
