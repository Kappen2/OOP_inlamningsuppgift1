public class Palmtree extends Plant implements Feed { // Arv
    Palmtree(String n, double h) {
        setHeight(h);
        setName(n);
    } //konstruktor
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = "kranvatten";
    }
    @Override
    public void waterPlant() { //Polymorfism
        this.water = getHeight() * 0.5;
    }
}