import javax.swing.*;

public class Program {

    private String outputLiquid;
    private double outputAmount;

    Cactus Igge = new Cactus(0.2); //Skapar växterna
    Palms Laura = new Palms(5.0);
    Palms Putte = new Palms(1.0);
    CarnivorousPlants Meatloaf = new CarnivorousPlants(0.7);



    void program() {
        //Ger växterna rätt värden
        Igge.waterPlant();
        Igge.setLiquid();
        Laura.waterPlant();
        Laura.setLiquid();
        Putte.waterPlant();
        Putte.setLiquid();
        Meatloaf.waterPlant();
        Meatloaf.setLiquid();

        try { //Kollar vilken växt som användaren har valt med Switch-case
            label:
            while (true) {
                String input = JOptionPane.showInputDialog(null, "Vilken växt ska få mat? ");
                input = input.toLowerCase();
                switch (input) {
                    case "igge":
                        outputAmount = Igge.water;
                        outputLiquid = Igge.getLiquid();
                        break label;
                    case "laura":
                        outputAmount = Laura.water;
                        outputLiquid = Laura.getLiquid();
                        break label;
                    case "putte":
                        outputAmount = Putte.water;
                        outputLiquid = Putte.getLiquid();
                        break label;
                    case "meatloaf":
                        outputAmount = Meatloaf.water;
                        outputLiquid = Meatloaf.getLiquid();
                        break label;
                    default:
                        JOptionPane.showMessageDialog(null, "Du skrev in en växt som inte finns. Försök igen");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.exit(0);
        } catch (NullPointerException e1) {
            JOptionPane.showMessageDialog(null, "Du har valt att avsluta programmet");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Växten ska ha " + outputAmount + " liter " + outputLiquid);
    }
}
