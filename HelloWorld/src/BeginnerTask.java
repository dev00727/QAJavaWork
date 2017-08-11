/**
 * Created by Administrator on 07/08/2017.
 */
import java.util.*;
public class BeginnerTask {

    public static void main(String[] args){
        //Task1();
        //System.out.println(Task2());
        //Task3("Random word");
        //String w= Task4();
        //System.out.println(w);
        //System.out.println(Task5(5,10, false));
        //loop(5);
        newArray();
    }
    public static void Task1(){
        System.out.println("Hello World!");

    }
    public static String Task2(){
        String word ="Hello World!";
        return word;
    }
    public static void Task3(String word){

        System.out.println(word);
    }
    public static String Task4(){

        return "Hello World!";
    }
    public static int Task5(int a, int b, boolean option){
        int c;
        if (option) {


             c = a + b;

        }
        else{
             c= a*b;

        }
        return c;
    }
    public static int Task6(int a, int b){
        if (a== 0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else {
            return a+b;
        }
    }
    public static void loop(int a){
        for (int i=0; i<a; i++){
            System.out.println(Task6(0,4));
        }
    }
    public static void Array(){

       // int[] a= new int[10];
       int[] a= {1,2,3,4,5,6,7,8,9,10};
       /* for (int i=1; i<=10; i++){
            System.out.println(Task6(i,i));
        }*/
        for (int i=0; i<11; i++){
            System.out.println(i);
        }
    }
    public static void newArray() {
        int[] a = new int[10];
        for (int i = 1; i < a.length; i++) {
            a[i] = i;

        }
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]=a[i]*10);

        }
    }
}
