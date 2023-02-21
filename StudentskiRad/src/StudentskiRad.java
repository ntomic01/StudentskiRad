import java.util.Date;

public abstract class StudentskiRad {

    private int ocena;

    private String naslov;

    private String mentor;

    private Date datumOdbrane;

    private Student student;

     public StudentskiRad(int ocena, String naslov, String mentor, Date datumOdbrane, Student student) {
         this.ocena = ocena;
         this.naslov = naslov;
         this.mentor = mentor;
         this.datumOdbrane = datumOdbrane;
         this.student = student;
     }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getNaslov() {
         return naslov;
     }

     public void setNaslov(String naslov) {
         this.naslov = naslov;
     }

     public String getMentor() {
         return mentor;
     }

     public void setMentor(String mentor) {
         this.mentor = mentor;
     }

     public Date getDatumOdbrane() {
         return datumOdbrane;
     }

     public void setDatumOdbrane(Date datumOdbrane) {
         this.datumOdbrane = datumOdbrane;
     }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public abstract boolean validan();

    public abstract boolean polozen();

}
