package HW4;

public class App {

    public static void main(String[] args) {
        WeightControl weightControl = new WeightControl(6);
        Potato potato = new Potato(5);
        if (weightControl.isPossible(potato)) {
            System.out.println("Вес ок");
        } else {
            System.out.println("Превышение веса");
        }

        Milk milk1 = new Milk(10);
        Milk milk2 = new Milk(10000);

        WeightAdapter milk1Adapter = new WeightAdapter(milk1);
        WeightAdapter milk2Adapter = new WeightAdapter(milk2);

        if (weightControl.isPossible(milk1Adapter)) {
            System.out.println("Вес ок");
        } else {
            System.out.println("Превышение веса");
        }

        if (weightControl.isPossible(milk2Adapter)) {
            System.out.println("Вес ок");
        } else {
            System.out.println("Превышение веса");
        }
    }
}
