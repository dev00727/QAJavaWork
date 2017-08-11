import java.util.ArrayList;

/**
 * Created by Administrator on 07/08/2017.
 */
public class TestPerson {
    public static void main (String[] args){

        ArrayList<Person> p1= createPerson();
       // itterate(p1);
        search(p1, "Steve");

    }
    public static ArrayList createPerson(){
        ArrayList<Person> pData= new ArrayList<>();
        Person p1= new Person("Bob","28", "Salesman");
        pData.add(p1);
        Person p2= new Person("Mr T", "43", "Boxer");
        pData.add(p2);
        Person p3= new Person("Thanos", "Unknown", "Sits on chair");
        pData.add(p3);
        Person p4= new Person("Steve", "120", "Captain");
        pData.add(p4);
        Person p5= new Person("Trevor", "32", "Spy");
        pData.add(p5);
        //System.out.println(p4.toString());
return pData;
    }
    public static void itterate(ArrayList<Person> pData){


        for (Person name : pData) {
            System.out.println(name.toString());
        }
    }
    public static void search(ArrayList<Person> pData, String searchBy){
        for (Person name : pData) {

            if (searchBy.equals( name.getName())) {
                System.out.println(name.toString());
            }
        }
    }
}
