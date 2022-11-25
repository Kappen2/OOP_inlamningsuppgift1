package PlantHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmtreeTest {

    Palmtree p = new Palmtree("Nisse", 1.0);
    Palmtree p1 = new Palmtree("Maria", 2.5);

    @Test
    void setLiquidAmountTest() {
        p.setLiquidAmount();
        p1.setLiquidAmount();
        assert(p.getLiquidAmount() == 0.5);
        assert(p.getLiquidAmount() != 0.2);
        assert(p1.getLiquidAmount() == 1.25);
        assert(p1.getLiquidAmount() != 0.5);
    }
}