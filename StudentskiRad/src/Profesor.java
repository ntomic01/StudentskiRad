public class Profesor extends Osoba {

    private String sifraProfesora;

    public Profesor(String sifraProfesora, String ime, String prezime, String jmbg) {
        super(ime, prezime, jmbg);
        this.sifraProfesora = sifraProfesora;
    }

    public String getSifraProfesora() {
        return sifraProfesora;
    }

    public void setSifraProfesora(String sifraProfesora) {
        this.sifraProfesora = sifraProfesora;
    }

}
