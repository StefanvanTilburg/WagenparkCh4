package model;

import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 *
 *         Class Vestiging wordt gebruikt in Opdracht 7.3 Wagenpark. Wagenpark slaat op plaats, manager, autos
 */
public class Vestiging {
    private String plaats;
    private String manager;
    private ArrayList<Auto> autos;

    public Vestiging(String plaats, String manager) {
        this.setPlaats(plaats);
        this.setManager(manager);
        this.autos = new ArrayList<>();
    }

    public void voegAutoToe(Auto auto) {
        this.autos.add(auto);
    }

    @Override
    public String toString() {
        String autos = "";

        for (Auto auto : this.autos) {
            autos += String.format("%s\n", auto.toString());
        }

        return String.format("Plaats: %s\nManager: %s\n%s", this.getPlaats(), this.getManager(), autos);
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
