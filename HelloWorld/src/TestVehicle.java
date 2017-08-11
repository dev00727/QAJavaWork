import java.util.ArrayList;

/**
 * Created by Administrator on 07/08/2017.
 */
public class TestVehicle {
    public static void main (String[] args){
        createVehicle();


    }
    public static void createVehicle(){

        Car c1= new Car("red",120,4,"1",5, "car",4,5,1);
        Motorcycle m1= new Motorcycle("black",180,2,"2", 2, "bike", true, false);
        Bus b1= new Bus("green",110,15,"3", 20, "bus","public");
        ArrayList<Vehicle> v= new ArrayList<>();
        v.add(c1);
        v.add(m1);
        v.add(b1);
        addToGarage(v);

    }
    public static void addToGarage(ArrayList<Vehicle> v){

        Garage g= new Garage(v);
        //g.addVehicle(new Car("blue",200,2,"5",2,"car",4,2,0));
        //g.removeVehicleByType("car");
        //g.removeVehicle("3");
        g.calculateBill();
    }
}
