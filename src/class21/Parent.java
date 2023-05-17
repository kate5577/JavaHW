package class21;

public class Parent {
   final int noOfMonthsYear=12;
    final void getMarry(){
        System.out.println("Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    final int noOfHoursDay=24;
  @Override
    void study(){
        System.out.println("I want SDET");
      System.out.println(noOfMonthsYear);
    }



}
