/**
 * Created by Administrator on 07/08/2017.
 */
public class Vehicle {

    private String colour;
    private int speed;
    private int passengers;
    private String reg;
    private int seats;
    private String vehicleType;

    public Vehicle(String colour, int speed, int passengers, String reg, int seats, String vehicleType) {
        this.colour = colour;
        this.speed = speed;
        this.passengers = passengers;
        this.reg = reg;
        this.seats = seats;
        this.vehicleType = vehicleType;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getPassengers() {

        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }


    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }



    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }



        }
