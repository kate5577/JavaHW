package class18;

public class BMW extends Cars{
}

class CarsTester {
    void offerMPackage(){
        System.out.println("Only BMW offers");
    }
    public static void main(String[] args) {

       BMW bmw = new BMW();
        bmw.start();
    }
}
