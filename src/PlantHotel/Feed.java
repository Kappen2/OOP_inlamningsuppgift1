package PlantHotel;

public interface Feed { //Interface
    double l = 0;
    default double setLiquidAmount() {return l;}
    default double getLiquidAmount() {
        return l;
    }
}
