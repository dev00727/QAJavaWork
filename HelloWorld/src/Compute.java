
import java.util.List;

/**
 * Created by Administrator on 10/08/2017.
 */
public class Compute {
    private List<Paint> p;
    private Room r;
    private String cheapest;

    public Compute(List<Paint> p, Room r) {
        this.p = p;
        this.r = r;

    }

    public String getCheapest() {
        return cheapest;
    }

    public void setCheapest(String cheapest) {
        this.cheapest = cheapest;
    }

    public Room getR() {
        return r;
    }

    public void setR(Room r) {
        this.r = r;
    }


    public List<Paint> getP() {
        return p;
    }

    public void setP(List<Paint> p) {
        this.p = p;
    }

    public String calcWaste() {
        double[] arr = new double[3];
        int i = 0;
        double rs = r.getSize();
        double oldwaste = 10000000;
        String winner = "";
        for (Paint p1 : p) {

            double waste= (Math.ceil(r.getSize() / p1.covers()))*p1.getLitre();
            waste= waste-(r.getSize()/p1.getM2PerL());

            if (oldwaste > waste) {
                oldwaste = waste;
                winner = p1.getName();
            }
            else if(oldwaste==waste){
                winner= calculateCheapest();
            }
        }
        return winner;
    }

    public String calculateCheapest() {
        double[] arr = new double[3];
        int i = 0;
        double rs = r.getSize();
        String cheap;
        for (Paint p1 : p) {

            double need = Math.ceil(rs / p1.covers());
            double price = need * p1.getPrice();
            p1.setPrice(price);

        }
        double current = 100000;
        String winner = "";

        for (Paint p1 : p) {
            if (current > p1.getPrice()) {
                current = p1.getPrice();
                winner = p1.getName();
            }


        }
        return winner;
    }

}
