package PlantHotel;

import org.junit.jupiter.api.Test;

class CactusTest{

    Cactus c = new Cactus("Kalle", 2.4);
    Cactus c1 = new Cactus("Anna", 0.3);

    @Test
    void setLiquidAmountTest() {
        c.setLiquidAmount();
        c1.setLiquidAmount();
        assert(c.getLiquidAmount() == 0.02);
        assert(c.getLiquidAmount() != 0.4);
        assert(c1.getLiquidAmount() == 0.02);
        assert(c1.getLiquidAmount() != 0);
    }
}