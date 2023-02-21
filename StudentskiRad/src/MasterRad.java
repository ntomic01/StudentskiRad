import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class MasterRad extends StudentskiRad {
    private Student student;
    private List <ClanoviKomisije> clanoviKomisije;

    public MasterRad(List <ClanoviKomisije> clanoviKomisije, String naslov, String mentor, Date datumOdbrane) {
        super(naslov, mentor, datumOdbrane);
        this.clanoviKomisije = clanoviKomisije;
    }

    public List<ClanoviKomisije> getClanoviKomisije() {
        return clanoviKomisije;
    }

    public void setClanoviKomisije(List<ClanoviKomisije> clanoviKomisije) {
        this.clanoviKomisije = clanoviKomisije;
    }

    public void dodajStudenta(Student student){

    }


}
