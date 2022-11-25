package PlantHotel;

public abstract class Plant{
    private String name;
    private double height; //Inkapsling
    protected double liquidAmount;
    protected String liquid = "";
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setHeight(double h) {
        if(h>=0)
            this.height = h;
        else
            throw new IllegalArgumentException("Negativ höjd");
    }
    public double getHeight() {
        return this.height;
    }
    public abstract void setLiquid();
    public String getLiquid() {
        return this.liquid;
    }
}
