
import java.util.ArrayList;

public class Section {

    private Student[] arrayStu;
    private static int numStu;

    Section(int size) {
        this.arrayStu = new Student[size];
    }

    public void addStudent(Student st) {
        try {
            arrayStu[numStu] = st;
            System.out.println("Estudiante agregado");
            numStu += 1;
        } catch (Exception e) {
            System.out.println("La sección de la EE está llena");
        }
    }

    public Student searchMax() {
        Student older = arrayStu[0];

        for (Student student : arrayStu) {
            if (student.getAge() > older.getAge()) {
                older = student;
            }
        }

        return older;
    }

    public Student searchMax(String gender) {
        Student older = null;

        for (Student student : arrayStu) {
            if (student.getAge() > 0 && student.getGender().equals(gender)) {
                older = student;
            }
        }

        return older;
    }

    public int splitStudents(Student[] male, Student[] female) {
        ArrayList<Student> maleStudents = new ArrayList<>();
        ArrayList<Student> femaleStudents = new ArrayList<>();

        for (Student mStudent : male) {
            System.out.println("Male: " + mStudent.getName());
            System.out.println("");
            maleStudents.add(mStudent);
        }

        for (Student fStudent : female) {
            System.out.println("Female: " + fStudent.getName());
            System.out.println("");
            femaleStudents.add(fStudent);
        }

        return femaleStudents.size();
    }
}
