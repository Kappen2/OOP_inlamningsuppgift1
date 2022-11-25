package PlantHotel;

public class Cactus extends Plant implements Feed { //Arv

    String l = Liquid.MINERALVATTEN.liquid;
    Cactus(String n, double h) { //konstruktor
        setHeight(h);
        setName(n);
    }
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = l;
    }
    @Override
    public double setLiquidAmount() { //Polymorfism
        this.liquidAmount = 0.02;
        return this.liquidAmount;
    }
    public double getLiquidAmount() {
        return liquidAmount;
    }
}