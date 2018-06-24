public class Piirustusluettelo {
    private String LuetteloNimi;
    private String ProjektinNimi;
    private String LuetteloStatus;


    public Piirustusluettelo luoUusi(String LuetteloNimi, String ProjektinNimi) {
        Piirustusluettelo uusi = new Piirustusluettelo();
        uusi.setLuetteloNimi(LuetteloNimi);
        uusi.setProjektinNimi(ProjektinNimi);
        return uusi;
    }

    public String getLuetteloNimi() {
        return LuetteloNimi;
    }

    public void setLuetteloNimi(String luetteloNimi) {
        LuetteloNimi = luetteloNimi;
    }

    public String getProjektinNimi() {
        return ProjektinNimi;
    }

    public void setProjektinNimi(String projektinNimi) {
        ProjektinNimi = projektinNimi;
    }

    public String getLuetteloStatus() {
        return LuetteloStatus;
    }

    public void setLuetteloStatus(String luetteloStatus) {
        LuetteloStatus = luetteloStatus;
    }
}
