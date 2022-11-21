public class Palms extends Plants implements Feed { // Arv
    Palms(double h) {
        setHeight(h);
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