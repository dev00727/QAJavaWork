import java.util.List;

/**
 * Created by Administrator on 11/08/2017.
 */
public class Library implements InputOutput {

    private List<Person> p;
    private List<Item> i;

    //list of overdue books?
    public Library() {

    }

    public void search() {

    }

    public void add() {
    }

    public void delete() {
    }

    public Person search(Person i) {// fix here
        return null;
    }

    public List<Person> getP() {
        return p;
    }

    public void setP(List<Person> p) {
        this.p = p;
    }

    public List<Item> getI() {
        return i;
    }

    public void setI(List<Item> i) {
        this.i = i;
    }
}
