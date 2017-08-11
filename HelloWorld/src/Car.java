/**
 * Created by Administrator on 07/08/2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int boot;

    public Car(String colour, int speed, int passengers, String reg, int seats, String vehicleType, int wheels, int doors, int boot){

        super(colour, speed,passengers, reg, seats, vehicleType);
        this.wheels= wheels;
        this.doors=doors;
        this.boot= boot;

    }


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getBoot() {
        return boot;
    }

    public void setBoot(int boot) {
        this.boot = boot;
    }
}
