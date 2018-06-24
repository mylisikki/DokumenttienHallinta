import java.util.Date;
import java.util.Scanner;

public class Dokumenttienhallinta {

    public static void main(String[] args) {

        Piirustusluettelo piirustusluettelo = Piirustusluettelo.luoUusi("Rakennepiirustukset", "Projekti1");

        Scanner lukija = new Scanner(System.in);
        System.out.println("1. Luo uusi piirustusluettelo\n2. Luo uusi piirustus\n3. Hae piirustusluettelo\n4. Hae piirustus");
        String komento = lukija.nextLine();


        while (!komento.equals("lopeta")) {
            System.out.println("1. Luo uusi piirustusluettelo\n2. Luo uusi piirustus\n3. Hae piirustusluettelo\n4. Hae piirustus");
            komento = lukija.nextLine();
            if (komento == "1." || komento == "2." || komento == "3." || komento == "4.") {
                if (komento == "1.") {
                //    Piirustusluettelo.luoUusi();
                    piirustusluettelo.tulostaLuettelo();
                } if (komento == "2.") {
                    System.out.print("Anna piirustusnumero: ");
                    String numero = lukija.nextLine();
                    System.out.println("");
                    System.out.print("Anna sisalto: ");
                    String sisalto = lukija.nextLine();
                    System.out.println("");
                    piirustusluettelo.lisaaPiirustus (Piirustus.luoUusi(numero, sisalto));
                } if (komento == "3." || komento == "4.") {
                    System.out.println("Hakutoiminto ei ole vielä käytössä.");
                }
            } else {
                System.out.println("Virheellinen komento. ");
                System.out.println("");
            }

        }
        System.out.println("Ohjelma lopetettu.");
    }
}
