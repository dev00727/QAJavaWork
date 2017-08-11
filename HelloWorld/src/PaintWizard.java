import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 09/08/2017.
 */
public class PaintWizard {

    public static void main(String[] args) {
        createObject();
    }

    public static void createObject() {
        List<Paint> paint = new ArrayList<>();
        Paint p = new Paint("CheapoMax", 19.99, 10, 20);
        paint.add(p);
        Paint p1 = new Paint("AverageJoes", 17.99, 11, 15);
        paint.add(p1);
        Paint p2 = new Paint("Duluxourous", 25.00, 20, 10);
        paint.add(p2);

        Room r = new Room(106);
        Compute c = new Compute(paint, r);
        String winner2 = c.calcWaste();
        String winner = c.calculateCheapest();

        System.out.println("Least wasting is " + winner2);
        System.out.println("Cheapest is " + winner);

    }
}
