package ex_5_classes_and_methods;

public class Player {

    private String name;
    private int number;

    public Player(String name, int number){
        this.name = name;
        this.number = number;
    }



    public void printPlayer(){

        System.out.println("Name of player: " + name + " and his number is " + number);
    }


}

 class PrintPlayer {

    public static void main(String[] args){
            Player player1 = new Player("Ronaldo", 7);
            player1.printPlayer();

            Player player2 = new Player("Beckham", 10);
            player2.printPlayer();
        }
        }
