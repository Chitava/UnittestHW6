public class Averege {
    private double averege1;
    private double averege2;

    public Averege(Massive mass1, Massive mass2) {
        this.averege1 = mass1.getAverege();
        this.averege2 = mass1.getAverege();
    }

    public String compareAverage() {
        if (averege1 == averege2) {
            return String.format("Среднее арифметическое первого массива %s равно среднему арифметическому второго " +
                    "массива %s", Math.round(averege1 * 100.0) / 100.0, Math.round(averege2 *
                    100.0) / 100.0);
        } else if (averege1 > averege2) {
            return String.format("Среднее арифметическое первого массива %s больше среднего арифметического второго " +
                    "массива %s", Math.round(averege1 * 100.0) / 100.0, Math.round(averege2 *
                    100.0) / 100.0);
        } else if (averege1 < averege2) {
            return String.format("Среднее арифметическое первого массива %s меньше среднего арифметического второго " +
                    "массива %s", Math.round(averege1 * 100.0) / 100.0, Math.round(averege2 *
                    100.0) / 100.0);
        }
        return null;
    }
}



