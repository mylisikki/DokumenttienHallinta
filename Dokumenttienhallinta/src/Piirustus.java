import java.util.Date;

public class Piirustus {
    private String piirustusNumero;
    private String piirustusSisalto;
    private Date piirustusPaivamaara;
    private String piirustusStatus;
    private char revisiotunnus;
    private Date revisioPaivamaara;

    public Piirustus () {
    }

    public String getPiirustusNumero() {
        return this.piirustusNumero;
    }

    public String getPiirustusSisalto() {
        return this.piirustusSisalto;
    }

    public Date getPiirustusPaivamaara() {
        return this.piirustusPaivamaara;
    }

    public String getPiirustusStatus() {
        return this.piirustusStatus;
    }

    public char getRevisiotunnus() {
        return this.revisiotunnus;
    }

    public Date getRevisioPaivamaara() {
        return this.revisioPaivamaara;
    }

    public void setPiirustusNumero(String numero) {
        this.piirustusNumero = numero;
    }

    public void setPiirustusSisalto(String sisalto) {
        this.piirustusSisalto = sisalto;
    }

    public void setPiirustusPaivamaara(Date paivamaara) {
        this.piirustusPaivamaara = paivamaara;
    }

    public void setPiirustusStatus(String status) {
        this.piirustusStatus = status;
    }

    public void setRevisiotunnus(char tunnus) {
        this.revisiotunnus = tunnus;
    }

    public void setRevisioPaivamaara(Date paivamaara) {
        this.revisioPaivamaara = paivamaara;
    }

    public static Piirustus luoUusi(String numero, String sisalto) {
        Piirustus uusi = new Piirustus();
        uusi.setPiirustusNumero(numero);
        uusi.setPiirustusSisalto(sisalto);
        return uusi;
    }

    public void teeRevisio(char tunnus, Date paivamaara) {
        this.setRevisiotunnus(tunnus);
        this.setRevisioPaivamaara(paivamaara);
    }
}
