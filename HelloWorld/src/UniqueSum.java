/**
 * Created by Administrator on 07/08/2017.
 */
public class UniqueSum {


    public UniqueSum(){

    }
//    public static void main(String[] args){
//        System.out.println(sumIntegers(3,3,3));
//    }
    public int sumIntegers(int num1, int num2, int num3){
       int win=0;
       if (num1!= num2 && num1!=num3 &&num2!= num3){

            win= num1+num2+num3;
        }
        else if(num1== num2 && num1==num3 &&num2== num3){
           win=0;
       }
        else if(num1==num2){

            win= num3;
        }
        else if(num1==num3){
           win = num2;
       }
       else if(num2==num3){
           win = num1;
       }

        return win;
    }
}
