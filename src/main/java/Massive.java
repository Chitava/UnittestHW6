import java.util.ArrayList;
import java.util.Random;

public class Massive {
    private double averege;
    private ArrayList<Integer> array;

    public Massive(int len) {
        ArrayList arr = new ArrayList<>();
        for (int i = 0; i <= len; i++) {
            Random rnd = new Random();
            arr.add(rnd.nextInt(10));
            this.array = arr;
        }
        this.array = arr;
    }

    public double getAverege() {
        avr();
        return averege;
    }

    public void avr(){
        for (int i = 0; i < array.size()-1; i++) {
            averege = averege + array.get(i);
        }
        averege = averege/array.size();
    }

    public void printArray(){
        System.out.print("[");
        for (int i = 0; i < array.size()-2; i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.print(array.get(array.size()-1));
        System.out.print("]");
    }
}
