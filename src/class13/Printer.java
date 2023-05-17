package class13;

public class Printer {
    void printSomething() {
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
    }

    void printWord(String word) {
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }
        void printWordManyTimes (String word,int number){


            for (int i = 0; i < number; i++) {
                System.out.println(word);
            }



    }
}


