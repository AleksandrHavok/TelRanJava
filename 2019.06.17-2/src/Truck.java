public class Truck extends Transport {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck(String sn, String model, String manufacture, int year, int weight) {
        super(sn, model, manufacture, year);
        this.weight = weight;
    }

    @Override
    public String transportInfo() {
        return super.transportInfo()+" "+weight;
    }
}
