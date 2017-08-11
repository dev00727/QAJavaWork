import java.io.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 07/08/2017.
 */
public class TestPerson2 {
    public static void main (String[] args){
        create();
       // sendToFile();
        readFromFile();
    }
    public static void create(){
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
       sendToFile(pData);
    }
//
//    public static void sendToFile(Person name){
//        //System.out.println("hello");
//        try (ObjectOutputStream oos =
//                     new ObjectOutputStream(new FileOutputStream("C:\\Person.ser"))) {
//
//            oos.writeObject(name);
//               // for (int i=0; i< )
////            for (Person p : name) {
////                oos.writeObject(name);
////
////            }
//
//            System.out.println("Done");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//
//    }
    public static void sendToFile(ArrayList<Person> pdata){
        //System.out.println("hello");
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("C:\\Person.ser"))) {

          //  oos.writeObject(name);
//            for (int i=0; i<pdata.size(); i++ ){
//                Person p= pdata(i);
//                //oos.writeObject(data(i));
//
//            }
            for (Person p : pdata) {
                oos.writeObject(p);

            }
            oos.writeObject(null);
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public static void readFromFile(){
        FileInputStream fis=null;
        ObjectInputStream oos= null;
        Person p= null;
        ArrayList<Person> newP= new ArrayList<>();

        try{

             fis= new FileInputStream("C:\\Person.ser");
             oos= new ObjectInputStream(fis);
             Object tmp = null;

           //p = (Person) oos.readObject();
            while ((tmp = oos.readObject())!=null){
                System.out.println(tmp);
//              p=(Person) oos.readObject();
//                newP.add(p);
            }
//            for(Person x: newP){
//                System.out.println(x.toString());
//            }

            //System.out.println(p.toString());

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
