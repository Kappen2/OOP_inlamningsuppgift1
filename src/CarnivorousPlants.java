public class CarnivorousPlants extends Plants implements Feed { //Arv
    CarnivorousPlants(double h) {
        setHeight(h);
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