package CONTROLLER;

public  class Pet {
	 public String name;
	    public String breed;
	    public int age;
	    public double price;

	    // Constructor
	    public Pet(String name, String breed, int age, double price) {
	        this.name = name;
	        this.breed = breed;
	        this.age = age;
	        this.price = price;
	    }
            public  double getPrice()
            {
                return price;
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
