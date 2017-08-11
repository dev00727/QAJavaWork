/**
 * Created by Administrator on 07/08/2017.
 */
public class Bus extends Vehicle {
private String bustype;

    public Bus(String colour, int speed, int passengers, String reg, int seats, String vehicleType,String type){
        super(colour, speed,passengers, reg, seats, vehicleType);
    this.bustype= bustype;
    }
    public String getType() {
        return bustype;
    }

    public void setType(String bustype) {
        this.bustype = bustype;
    }


}
