package class22;

public abstract class File {
    abstract void open();
    void edit(){
        System.out.println("file edit");
    }
    void close(){
        System.out.println("file close");
    }
    private String name;
   private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    void printInfo(){
        System.out.println(name+" "+size);
    }
}
class JavaFile extends File{
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open(){
    System.out.println("Open Java");
}
@Override
void edit(){
    System.out.println("Edit java");
}
@Override
void close(){
    System.out.println("Close Java");
}
}
class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("Open WordFile");
    }
    @Override
    void edit(){
        System.out.println("Edit WordFile");
    }
    @Override
    void close(){
        System.out.println("Close WordFile");
    }

}
class PDfFile extends File{
    public PDfFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("Open PDfFil");
    }
    @Override
    void edit(){
        System.out.println("Edit PDfFil");
    }
    @Override
    void close(){
        System.out.println("Close PDfFil");
    }

}


