package PlantHotel;

public enum Liquid {
    MINERALVATTEN("mineralvatten"),
    KRANVATTEN("kranvatten"),
    PROTEINDRYCK("proteindryck");

    public final String liquid;

    Liquid(String l) {
        this.liquid = l;
    }
}

