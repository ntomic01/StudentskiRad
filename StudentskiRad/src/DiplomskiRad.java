import java.util.List;
import java.util.Date;

public class DiplomskiRad extends StudentskiRad  {

    private int ocena;

    private List<ClanoviKomisije> clanoviKomisije;

    private Student student;

    public DiplomskiRad(int ocena, String naslov, String mentor, Date datumOdbrane) {
        super(naslov, mentor, datumOdbrane);
        this.ocena = ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public List<ClanoviKomisije> getClanoviKomisije() {
        return clanoviKomisije;
    }

    public void setClanoviKomisije(List<ClanoviKomisije> clanoviKomisije) {
        this.clanoviKomisije = clanoviKomisije;
    }


}
