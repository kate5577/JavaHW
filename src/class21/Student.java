package class21;

public class Student {
    void  learning(){
        System.out.println("Students learn");
    }
    void relax(){
        System.out.println("students relaxing");

    }
    void read(){
        System.out.println("Students reading");
    }


}
class SyntaxStudent extends Student{
    @Override
    void read(){
        System.out.println("SyntaxStudent read");
    }
    @Override
    void relax(){
        System.out.println("Syntax Student relax");

    }
    @Override
    void learning(){
        System.out.println("Syntax Student learn");
    }
    void coding(){
        System.out.println("Syntax Student are coding");
    }

}
class CollegeStudent extends Student{
    @Override
    void read(){
        System.out.println("CollegeStudent  read");
    }
    @Override
    void relax(){
        System.out.println("CollegeStudent  relax");

    }
    @Override
    void learning(){
        System.out.println("CollegeStudent  learn");
    }

}
class SchoolStudent extends Student{
    @Override
    void read(){
        System.out.println("SchoolStudent   read");
    }
    @Override
    void relax(){
        System.out.println("SchoolStudent  relax");

    }
    @Override
    void learning(){
        System.out.println("SchoolStudent   learn");
    }
}





