package ex_2_conditionals;

public class ConditionalExcercises {


    public static void main(String args[]) {

        boolean isWarm = false;
        boolean isCold = false;
        boolean isWindy = true;

        if (isWarm) {
            System.out.println("Weather is warm");
        } else if (isCold){
            System.out.println("Weather is cold");
        } else if(isWindy){
            System.out.println("Weather is windy");
        } else {
            System.out.println("Weather is snowy");
        }

    }
}
