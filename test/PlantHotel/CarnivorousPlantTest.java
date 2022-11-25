package PlantHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {

    CarnivorousPlant cp = new CarnivorousPlant("Niklas", 0.5);
    CarnivorousPlant cp1 = new CarnivorousPlant("Julia", 1);

    @Test
    void setLiquidAmountTest() {
        cp.setLiquidAmount();
        cp1.setLiquidAmount();
        assert(cp.getLiquidAmount() == 0.2);
        assert(cp.getLiquidAmount() != 0.4);
        assert(cp1.getLiquidAmount() == 0.3);
        assert(cp1.getLiquidAmount() != 0.2);
    }
}