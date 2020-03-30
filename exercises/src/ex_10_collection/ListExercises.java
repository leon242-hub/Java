package ex_10_collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    private static List<String> newList = new ArrayList<>();




    public static void main(String[] args){
        ListExercises le = new ListExercises();
        addToLsit("Banan");
        addToLsit("Kiwi");
        addToLsit("Mandarynka");
        addToLsit("Jabłko");

        printList();

        removeFromList(2);
        printList();

        le.addOneMoreToList(2, "Pomarańcza");
        printList();

    }

    public static void addToLsit(String name){
        newList.add(name);

    }

    public static void printList(){
        System.out.println(newList);
    }

    public static void removeFromList(int index){
        newList.remove(index);
    }

    public void addOneMoreToList(int index, String fruit){
        newList.add(index, fruit);
    }


}
