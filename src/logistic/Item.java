package logistic;

public class Item {

    private String name;
    private int weightInGrams;
    private double price;
    public Item(String name, int weightInGrams, double price) {
        this.name = name;
        this.weightInGrams = weightInGrams;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", Weight = " + getWeightInGrams() + ", price =  NGN " + getPrice() + " \n";
    }

}
