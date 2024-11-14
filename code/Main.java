
public class Main {

    public static void main(String[] args) {
        Student kike = new Student("Enrique", 0, 20, "Male");
        Student mont = new Student("Montserrat", 1, 19, "Female");
        Student jordi = new Student("Jordi", 2, 20, "Male");
        Student jess = new Student("Jessica", 3, 20, "Female");

        Section section = new Section(4);
        section.addStudent(kike);
        section.addStudent(mont);
        section.addStudent(jordi);
        section.addStudent(jess);

        Student olderStudent = section.searchMax();
        Student olderFemale = section.searchMax("Female");

        System.out.print("Older student: ");
        olderStudent.display();
        System.out.println();
        System.out.println("Older female: ");
        olderFemale.display();

        System.out.println("");

        System.out.println(
                "There are: " + section.splitStudents(new Student[]{kike, jordi}, new Student[]{mont, jess}) + " females");

    }

}
