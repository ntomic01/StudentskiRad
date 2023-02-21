public class ClanKomisije {

    private Profesor profesor;

    private UlogaClanaKomisije uloga;

    public ClanKomisije(Profesor profesor, UlogaClanaKomisije uloga) {
        this.profesor = profesor;
        this.uloga = uloga;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public UlogaClanaKomisije getUloga() {
        return uloga;
    }

    public void setUloga(UlogaClanaKomisije uloga) {
        this.uloga = uloga;
    }
}
