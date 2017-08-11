/**
 * Created by Administrator on 07/08/2017.
 */
public class Motorcycle extends Vehicle {
    private boolean hasHelmet;
    private boolean hasSideCar;


    public Motorcycle(String colour, int speed, int passengers, String reg, int seats, String vehicleType,boolean hasHelmet, boolean hasSideCar){
        super(colour, speed,passengers, reg, seats, vehicleType);
    this.hasHelmet= hasHelmet;
    this.hasSideCar= hasSideCar;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
