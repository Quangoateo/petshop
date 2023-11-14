package MODEL;

public class Pet implements Description {
    private int id;
    private String name;
    private String breed;
    private int age;
    private double price;
    
    public Pet() {
    }
    
    public Pet(String name, String breed, int age, double price) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
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
    
    @Override
    public String getDescription() { return "lmao"; }
    
    @Override
    public String getDetails(String parameter) { return "lmao"; }
}
