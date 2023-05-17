package class22;

public class FileTester {
    public static void main(String[] args) {
        File []files={new JavaFile("Java name",123),new PDfFile("Pdf name",345),new WordFile("Word name",7896)};
        for(File fl:files){
            fl.close();
            fl.edit();
            fl.open();
            fl.printInfo();
        }
    }
}
