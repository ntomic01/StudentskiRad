import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {

    private String brojIndeksa;

    private List<StudentskiRad> listaStudentskihRadova;

    public Student(String ime, String prezime, String brojIndeksa, String jmbg) {
        super(ime, prezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.listaStudentskihRadova = new ArrayList<>();
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void dodajStudenskiRad(StudentskiRad studentskiRad) {
        this.listaStudentskihRadova.add(studentskiRad);
    }

    public List<StudentskiRad> getListaStudentskihRadova() {
        return listaStudentskihRadova;
    }
}
