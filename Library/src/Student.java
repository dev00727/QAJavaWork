import java.util.List;

/**
 * Created by Administrator on 11/08/2017.
 */
public class Student extends Person {
    private int fines;
    private List<Book> borrowed;

    public Student() {
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public List<Book> getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(List<Book> borrowed) {
        this.borrowed = borrowed;
    }
}
