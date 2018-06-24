import java.util.Date;
import java.util.Scanner;

public class Dokumenttienhallinta {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("1. Luo uusi piirrustusluettelo\n2. Luo uusi piirustus\n3. Hae piirustusluettelo\n4. Hae piirustus");
        String komento = lukija.nextLine();

        while (!komento.equals("lopeta")) {
            System.out.println("1. Luo uusi piirrustusluettelo\n2. Luo uusi piirustus\n3. Hae piirustusluettelo\n4. Hae piirustus");
            komento = lukija.nextLine();
            if (komento == "1." || komento == "2." || komento == "3." || komento == "4.") {
                if (komento == "1.") {
                //    Piirustusluettelo.luoUusi();
                } if (komento == "2.") {
                    System.out.print("Anna piirustusnumero: ");
                    String numero = lukija.nextLine();
                    System.out.println("");
                    System.out.print("Anna sisalto: ");
                    String sisalto = lukija.nextLine();
                    System.out.println("");
                    // piirustuksettaulu.add (Piirustus.luoUusi(numero, sisalto));
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
