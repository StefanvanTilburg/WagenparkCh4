package model;

/**
 * @author Stefan van Tilburg
 *
 *          Class Auto voor Opdracht 7.3 Wagenpark. Slaat merk, model, jaar, kenteken en km-stand op.
 */
public class Auto {
    private String merk;
    private String model;
    private int jaar;
    private int kilometerstand;
    private String kenteken;

    public Auto(String merk, String model, int jaar, int kilometerstand, String kenteken) {
        this.setMerk(merk);
        this.setModel(model);
        this.setJaar(jaar);
        this.setKilometerstand(kilometerstand);
        this.setKenteken(kenteken);
    }

    @Override
    public String toString() {
        return String.format("Merk: %s\nModel: %s\nJaar: %s\nKilometerstan: %d\nKenteken: %s\n",
                this.getMerk(), this.getModel(), this.getJaar(), this.getKilometerstand(), this.getKenteken());
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public String getKenteken() {
        return kenteken;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }
}
