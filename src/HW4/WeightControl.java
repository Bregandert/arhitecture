package HW4;

public class WeightControl {
    private double maxWeight;

    public WeightControl(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public WeightControl(){

    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public boolean isPossible(Potato potato) {
        return (this.getMaxWeight() >= potato.getWeight());
    }

}
