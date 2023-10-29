public class Averege {

    private Massive arr1;
    private Massive arr2;


    public Averege(int lenMass) {
        this.arr1 = new Massive(lenMass);
        this.arr2 = new Massive(lenMass);
    }

    public void compareAverage(){
        if (arr1.getAverege() == arr2.getAverege()){
            System.out.printf("Среднее арифметическое первого массива %s равно среднему арифметическому второго " +
                    "массива %s", Math.round(arr1.getAverege()* 100.0)/100.0, Math.round(arr2.getAverege()*
                    100.0)/100.0);
        } else if (arr1.getAverege() > arr2.getAverege()) {
            System.out.printf("Среднее арифметическое первого массива %s больше среднего арифметического второго " +
                    "массива %s", Math.round(arr1.getAverege()* 100.0) / 100.0, Math.round(arr2.getAverege()*
                    100.0)/100.0);
        }else if (arr1.getAverege() < arr2.getAverege()) {
            System.out.printf("Среднее арифметическое первого массива %s меньше среднего арифметического второго " +
                    "массива %s", Math.round(arr1.getAverege()* 100.0) / 100.0, Math.round(arr2.getAverege()*
                    100.0)/100.0);
            }
        }


    public Massive getArr1() {
        return arr1;
    }

    public Massive getArr2() {
        return arr2;
    }
}
