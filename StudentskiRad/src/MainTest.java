import java.util.Date;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

          Student student1 = new Student("Nikola", "Tomic", "4-10/2021", "1703001772028");

          StudentskiRad seminarskiRad1 = new SeminarskiRad(7, "Rad 1", "Profa 1", new Date(), student1);
          StudentskiRad seminarskiRad2 = new SeminarskiRad(9, "Rad 2", null, new Date(), student1);
          StudentskiRad diplomskiRad = new DiplomskiRad(10, "Diplomski", "Profa 2", new Date(), student1);
          StudentskiRad masterRad = new MasterRad(6,"Master", "Profa 2", new Date(), student1);

          student1.dodajStudenskiRad(seminarskiRad1);
          student1.dodajStudenskiRad(seminarskiRad2);
          student1.dodajStudenskiRad(diplomskiRad);
          student1.dodajStudenskiRad(masterRad);

          for(StudentskiRad studentskiRad: student1.getListaStudentskihRadova()) {
              System.out.println("=========================");
              boolean polozen = studentskiRad.polozen();
              boolean validan = studentskiRad.validan();
              System.out.println(studentskiRad.getNaslov()+" - "+studentskiRad.getOcena() + " polozen? "+polozen + " validan: "+validan);
              System.out.println("=========================");
          }


    }
}
