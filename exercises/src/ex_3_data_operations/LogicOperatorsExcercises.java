package ex_3_data_operations;

public class LogicOperatorsExcercises {

    public static void main(String[] args){


        String textOne = "tekst pierwszy";
        String textTwo = "tekst pierwszy";
        int numberOne = 55;
        int numberTwo = 67;
        int numberThree = 54;


        if(textOne == textTwo){
            System.out.println("Zmienne są identyczne");
        }

        if(numberOne >= numberTwo || numberOne < numberTwo && numberOne != numberThree) {
            System.out.println("numer 1 jest większy równy numer dwa");
        }


    }
}
