public class Car {
    String colour;
    int numWheels;

    public Car(String colour, int numWheels) {
        this.colour = colour;
        this.numWheels = numWheels;
    }

    public void printDetails(){
        System.out.println("Colour is "+ this.colour);
        System.out.println("Wheel count is "+ this.numWheels);
    }
}
