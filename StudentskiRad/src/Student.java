import java.util.List;
import java.util.ArrayList;

public class Student extends Osoba {

    private String ime;

    private String prezime;

    private String brojIndeksa;

    private String jmbg;
    private List<StudentskiRad> listaStudentskihRadova;

    public Student(String ime, String prezime, String brojIndeksa, List<StudentskiRad> listaStudentskihRadova, String jmbg) {
        super(ime, prezime, jmbg);
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.listaStudentskihRadova = listaStudentskihRadova;
        this.jmbg = jmbg;
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

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
