package PlantHotel;

public class Palmtree extends Plant implements Feed { // Arv

    String l = Liquid.KRANVATTEN.liquid;
    Palmtree(String n, double h) {
        setHeight(h);
        setName(n);
    } //konstruktor
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = String.valueOf(l);
    }
    @Override
    public double setLiquidAmount() { //Polymorfism
        this.liquidAmount = getHeight() * 0.5;
        return this.liquidAmount;
    }
    public double getLiquidAmount() {
        return liquidAmount;
    }
}