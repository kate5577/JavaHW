package class13;

public class Task3 {
    public static void main(String[] args) {

        String str="njkaDRCVFT12345!@#$";
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());
        //short way
        System.out.println(str.replaceAll("[^a-zA-z]","").length());

    }
}
