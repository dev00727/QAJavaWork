import javax.swing.*;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Intermediate {

    //    public static void main(String[] args) {
//
//        System.out.println(blackJack2(20, 18));
//
//    }
    public Intermediate() {


    }

    public int blackJack2(int num1, int num2) {
        int win = 0;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (num1 != 0 && num2 != 0) {
            if (num1 < 22 && num2 < 22) {
                sum1 = 21 - num1;
                sum2 = 21 - num2;
                if (sum1 < sum2) {
                    win = num1;
                    //System.out.println("inside2");
                } else {
                    win = num2;
                    //System.out.println("inside3");
                }

            } else {
                if (num1 < 22) {
                    win = num1;
                } else if (num2 < 22) {
                    win = num2;
                } else {
                    win = 0;
                }


            }


        }

        return win;

    }
}