package controller;

import model.Auto;
import model.Vestiging;

import java.util.ArrayList;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 7.4 Wagenpark
 * <p>
 * Doel     Gebruik een ArrayList als attribuut. Thema autodealer met meerdere vestigingen
 */
public class WagenparkLauncher {
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Toyota", "Prius", 2015, 63234, "GG-111-K"));
        autos.add(new Auto("Dacia", "Logan MPV", 2017, 46367, "KS-567-W"));
        autos.add(new Auto("Tesla", "S 100D", 2019, 12646, "TR-264-X"));

        for (Auto auto : autos) {
            System.out.println(auto);
        }

        Vestiging vestiging = new Vestiging("Goumere", "Albert Mol");
        for (Auto auto : autos) {
            vestiging.voegAutoToe(auto);
        }
        System.out.println();
        System.out.println(vestiging.toString());
    }
}
