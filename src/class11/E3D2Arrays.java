package class11;

public class E3D2Arrays {
    public static void main(String[] args) {

        String[][] names2DArray = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}

        };

        for(String [] name1DArr:names2DArray){
            for(String name:name1DArr){
                System.out.println(name);
            }
        }

        
        }
    }

