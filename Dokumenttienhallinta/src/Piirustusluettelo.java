import java.util.List;

public class Piirustusluettelo {
    private String luetteloNimi;
    private String projektinNimi;
    private String luetteloStatus;
    private List<Piirustus> luettelonPiirustukset;

    public Piirustusluettelo() {
    }

    public static Piirustusluettelo luoUusi(String LuetteloNimi, String ProjektinNimi) {
        Piirustusluettelo uusi = new Piirustusluettelo();
        uusi.setLuetteloNimi(LuetteloNimi);
        uusi.setProjektinNimi(ProjektinNimi);
        return uusi;
    }

    public String getLuetteloNimi() {
        return luetteloNimi;
    }

    public void setLuetteloNimi(String luetteloNimi) {
        this.luetteloNimi = luetteloNimi;
    }

    public String getProjektinNimi() {
        return projektinNimi;
    }

    public void setProjektinNimi(String projektinNimi) {
        this.projektinNimi = projektinNimi;
    }

    public String getLuetteloStatus() {
        return luetteloStatus;
    }

    public void setLuetteloStatus(String luetteloStatus) {
        this.luetteloStatus = luetteloStatus;
    }

    public void lisaaPiirustus(Piirustus piirustus){
        luettelonPiirustukset.add(piirustus);
    }

    public void tulostaLuettelo(){
        System.out.println("\n" + getLuetteloNimi() + ", " + getProjektinNimi());
        for (Piirustus p: luettelonPiirustukset) {
            System.out.println(p.getPiirustusNumero() + ", " + p.getPiirustusSisalto() + ", " + p.getPiirustusPaivamaara());
        }
        System.out.println("");
    }
}
