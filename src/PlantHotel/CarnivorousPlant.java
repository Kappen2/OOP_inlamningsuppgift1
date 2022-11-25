package PlantHotel;


public class CarnivorousPlant extends Plant implements Feed { //Arv

    String l = Liquid.PROTEINDRYCK.liquid;
    CarnivorousPlant(String n, double h) { //konstruktor
        setHeight(h);
        setName(n);
    }
    @Override
    public void setLiquid() { //Polymorfism
        this.liquid = l;
    }
    @Override
    public double setLiquidAmount() { //Polymorfism
        this.liquidAmount = 0.1 + (0.2*getHeight());
        return this.liquidAmount;
    }
    public double getLiquidAmount() {
        return liquidAmount;
    }
}