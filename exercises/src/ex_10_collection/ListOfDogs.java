package ex_10_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListOfDogs {

    private static ArrayList<Dog> listOfDogs = new ArrayList<>();

    public static void main(String[] args){
        listOfDogs.add(new Dog("Azor"));
        listOfDogs.add(new Dog("Reks"));
        listOfDogs.add(new Dog("Pluto"));

        printAllDogs();
    }


    public static void printAllDogs(){
        listOfDogs.forEach(dogs -> System.out.println(dogs.getDogName()));
    }

}
