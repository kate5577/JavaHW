package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        int moneyStore = 2000;
        String day = "Monday";
        if (moneyStore > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("lets go shopping");
            } else {
                System.out.println("Lets wait for Sunday");
            }


        }else{
            System.out.println("lets save more");
        }


    }
}
