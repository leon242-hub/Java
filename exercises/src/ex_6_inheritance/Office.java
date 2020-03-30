package ex_6_inheritance;

public class Office extends  Building {

    public String officeRoom;

    public Office(String door, String window, String officeRoom) {
        super(door, window);
        this.officeRoom = officeRoom;
    }


    @Override
    public String toString() {
        return "Office{" +
                "officeRoom='" + officeRoom + '\'' +
                "} " + super.toString();
    }
}


class Application2 {
    public static void main (String[] args){
        Office office = new Office("drzwi wejściowe", "okno na południe", "pokój akwarium");
        System.out.println(office.toString());
    }
}