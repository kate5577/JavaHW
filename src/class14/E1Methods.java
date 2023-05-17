package class14;

public class E1Methods {
    void printWord(String word){        //void=>return type of the method void means this method does not return any data
        System.out.println(word);      //other examples of return types can be String int boolean char Dog cat etc.
                                       // printWord=>it is the name of the method
                                        //(String word)=>parameters/input
 //System.out.println(word);  =>body of the method you can write if else condition loops
    }

    public static void main(String[] args) {
// we are creating an object of the E1Methods class
        //in Java all classes can be treated as data type
        //new E1Methods(); creating the object of the E1Methods class
        E1Methods obj=new E1Methods();
        //we are calling the printWord() method on obj and passing "java" as argument or input
        obj.printWord("Java");




    }
}
