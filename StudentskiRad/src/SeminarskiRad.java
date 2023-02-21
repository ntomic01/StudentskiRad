import java.util.Date;

public class SeminarskiRad extends StudentskiRad{

    private int ocena;

    private Student student;

    public SeminarskiRad(int ocena, String naslov, String mentor, Date datumOdbrane) {
        super(naslov, mentor, datumOdbrane);
        this.ocena = ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

}

