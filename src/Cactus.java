public class Cactus extends Plant implements Feed { //Arv
    Cactus(String n, double h) { //konstruktor
        setHeight(h);
        setName(n);
    }
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = "mineralvatten";
    }
    @Override
    public void waterPlant() { //Polymorfism
        this.water = 0.02;
    }
}