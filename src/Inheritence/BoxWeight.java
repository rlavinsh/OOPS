package Inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);   // call the parent class constructor
        // used to intialise values present in parent class
        this.weight = weight;
    }
}
