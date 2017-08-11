import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Garage {
    private ArrayList<Vehicle> v;


    public Garage(ArrayList<Vehicle> v) {
        this.v = v;
    }

    public ArrayList<Vehicle> getV() {
        return v;
    }

    public void setV(ArrayList<Vehicle> v) {
        this.v = v;
    }
    public void calculateBill(){
        for(Vehicle veh: v){
            //System.out.println("here");
            if (veh instanceof Car){
                System.out.println("Car bill is: " + 100);
            }
            else if(veh instanceof Motorcycle){
                System.out.println("Bike bill is: " + 80);
            }
            else if(veh instanceof Bus){
                System.out.println("Bus bill is: " + 150);
            }
        }
    }
    public void addVehicle(Vehicle vehicle1){
        v.add(vehicle1);
    }
    public void removeVehicleByType(String vehicleType){
/*
        Iterator<Vehicle> itr= v.iterator();
        while(itr.hasNext()){
            if (vehicleType.equals("car")){

            }
            Vehicle V= itr.next();
            if(V.getVehicleType().equals(vehicleType)){
                v.remove(V);
            }
        }*/
        for(int i=0; i<v.size(); i++){
            if (vehicleType.equals("car") && v.get(i) instanceof  Car){
                v.remove(i);

            }
            if (vehicleType.equals("bike") && v.get(i) instanceof  Motorcycle){
                v.remove(i);

            }
            if (vehicleType.equals("bus") && v.get(i) instanceof  Bus){
                v.remove(i);

            }
}

    }
    public void removeVehicle(String reg) {
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).getReg().equals(reg)){
                v.remove(i);
                break;
            }

        }
    }


    public void emptyGarage(){
        v.clear();

    }


}
