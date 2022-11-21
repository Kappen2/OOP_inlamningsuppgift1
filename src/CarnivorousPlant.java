public class CarnivorousPlant extends Plant implements Feed { //Arv
    CarnivorousPlant(String n, double h) {
        setHeight(h);
        setName(n);
    } //konstruktor
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = "proteindryck";
    }
    @Override
    public void waterPlant() { //Polymorfism
        this.water = 0.1 + (0.2*getHeight());
    }
}