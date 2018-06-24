import java.util.Date;
import java.util.Scanner;

public class Dokumenttienhallinta {

    public static void main(String[] args) {

        Piirustusluettelo piirustusluettelo = Piirustusluettelo.luoUusi("Rakennepiirustukset", "Projekti1");

        Scanner lukija = new Scanner(System.in);
        //System.out.println("1. Luo uusi piirustusluettelo\n2. Luo uusi piirustus\n3. Hae piirustusluettelo\n4. Hae piirustus");
        String komento = "komento";

        while (!komento.equals("lopeta")) {
            System.out.println("1. Luo uusi piirustusluettelo\n2. Luo uusi piirustus\n3. Hae piirustusluettelo\n4. Hae piirustus");
            System.out.print("\nValitse toiminto: ");
            komento = lukija.nextLine();
            //System.out.println("Valintasi oli: " + komento);

            if (komento.equals("1") || komento.equals("2") || komento.equals("3") || komento.equals("4")) {
                if (komento.equals("1")) {
                //    Piirustusluettelo.luoUusi();
                    piirustusluettelo.tulostaLuettelo();
                } else if (komento.equals("2")) {
                    System.out.print("Anna piirustusnumero: ");
                    String numero = lukija.nextLine();
                    System.out.println("");
                    System.out.print("Anna sisalto: ");
                    String sisalto = lukija.nextLine();
                    System.out.println("");
                    piirustusluettelo.lisaaPiirustus (Piirustus.luoUusi(numero, sisalto));

                } else if (komento.equals("3") || komento.equals("4")) {
                    System.out.println("Hakutoiminto ei ole vielä käytössä.\n");
                }
            } else {
                System.out.println("Virheellinen komento.\n");
            }

        }
        System.out.println("Ohjelma lopetettu.");
    }
}
