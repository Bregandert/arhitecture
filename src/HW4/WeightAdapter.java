package HW4;

public class WeightAdapter extends Potato {

    private Milk milk;


    public WeightAdapter(Milk milk) {
        this.milk=milk;

    }

    @Override
    public double getWeight() {
        double weight = milk.getVolume() * 0.001027;

        return weight;
    }
}
