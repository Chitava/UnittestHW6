public class Main {
    public static void main(String[] args) {
       Massive mass1 = new Massive(5);
       Massive mass2 = new Massive(5);
       Averege compareMass = new Averege(mass1, mass2);
        System.out.println(compareMass.compareAverage());
    }
}