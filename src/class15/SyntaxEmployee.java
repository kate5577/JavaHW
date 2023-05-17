package class15;

public class SyntaxEmployee {
    String empID;
    int salary;

    static String CEO="Sumair";

    public static void main(String[] args) {

        SyntaxEmployee obj=new SyntaxEmployee();
        SyntaxEmployee obj1=new SyntaxEmployee();

        obj.empID="578757km";
        obj.salary=300000;
        obj1.salary=80000;
        obj1.empID="2234768mm";
        System.out.println(obj.CEO);
        System.out.println(obj1.CEO);
        System.out.println(obj.salary);
        System.out.println(obj.empID);
        System.out.println(obj1.salary);
        System.out.println(obj1.empID);
    }
}
