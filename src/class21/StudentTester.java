package class21;

public class StudentTester {
    public static void main(String[] args) {

        Student[] student = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student st : student) {
            st.read();
            st.learning();
            st.relax();

        }

        Student st = new SchoolStudent();
        if (st instanceof SyntaxStudent) {
            ((SyntaxStudent) st).coding();
        }else{
            System.out.println("Type casting not possible");
        }
    }
}
