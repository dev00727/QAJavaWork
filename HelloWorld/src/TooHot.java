/**
 * Created by Administrator on 07/08/2017.
 */
public class TooHot {

//    public static void main (String[] args){
//        System.out.println(trueOrFalse(92, true));
//    }

    public TooHot(){

    }
    public boolean trueOrFalse(int temp, boolean b){
        boolean within;
        if (b){
            if (temp<=100 && temp >= 60){
                within=true;
            }
            else{
                within=false;
            }
        }
        else if(temp<=90 && temp>=60){
            within= true;
        }
        else{
            within= false;
        }
return within;
    }
}
