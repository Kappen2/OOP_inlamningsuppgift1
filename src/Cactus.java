public class Cactus extends Plant implements Feed { //Arv
    Cactus(double h) {
        setHeight(h);
    } //konstruktor
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = "mineralvatten";
    }
    @Override
    public void waterPlant() { //Polymorfism
        this.water = 0.02;
    }
}