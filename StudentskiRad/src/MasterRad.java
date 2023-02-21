import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class MasterRad extends StudentskiRad {

    private List<ClanKomisije> clanoviKomisije;

    public MasterRad(int ocena, String naslov, String mentor, Date datumOdbrane, Student student) {
        super(ocena, naslov, mentor, datumOdbrane, student);
        this.clanoviKomisije = new ArrayList<>();
    }

    public List<ClanKomisije> getClanoviKomisije() {
        return clanoviKomisije;
    }

    public void setClanoviKomisije(List<ClanKomisije> clanoviKomisije) {
        this.clanoviKomisije = clanoviKomisije;
    }

    public void dodajClanaKomisije(ClanKomisije clanKomisije) {
        this.clanoviKomisije.add(clanKomisije);
    }


    @Override
    public boolean validan() {
        return clanoviKomisije != null && clanoviKomisije.size() > 0;
    }

    @Override
    public boolean polozen() {
        return getOcena() >= 6;
    }
}
