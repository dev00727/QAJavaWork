/**
 * Created by Administrator on 09/08/2017.
 */
public class Paint {

    private String name;
    private double price;
    private double m2PerL;
    private double litre;


    public Paint(String name, double price, double m2PerL, double litre) {
        this.name = name;
        this.price = price;

        this.m2PerL = m2PerL;
        this.litre = litre;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getM2PerL() {
        return m2PerL;
    }

    public void setM2PerL(double m2PerL) {
        this.m2PerL = m2PerL;
    }

    public double covers() {
        return litre * m2PerL;
    }

}
