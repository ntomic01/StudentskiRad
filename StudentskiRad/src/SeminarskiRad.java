import java.util.Date;

public class SeminarskiRad extends StudentskiRad {

    public SeminarskiRad(int ocena, String naslov, String mentor, Date datumOdbrane, Student student) {
        super(ocena, naslov, mentor, datumOdbrane, student);
    }

    @Override
    public boolean validan() {
        return getMentor() != null;
    }

    @Override
    public boolean polozen() {
        return getOcena() >= 8;
    }

}

