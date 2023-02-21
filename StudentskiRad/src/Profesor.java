public class Profesor extends Osoba {

    private String sifraProfesora;
    private String ime;
    private String prezime;

    public Profesor(String sifraProfesora, String ime, String prezime, String jmbg) {
        super(ime, prezime, jmbg);
        this.sifraProfesora = sifraProfesora;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getSifraProfesora() {
        return sifraProfesora;
    }

    public void setSifraProfesora(String sifraProfesora) {
        this.sifraProfesora = sifraProfesora;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
