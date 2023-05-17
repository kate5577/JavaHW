package class14;

public class Task1 {
    boolean isPalindrome(String str){
        String reversedStr="";
        for(int i=str.length()-1;i>=0;i--){
            reversedStr=reversedStr+str.charAt(i);

        }
        boolean isStrPalindrome=false;

        if(str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;

        }
return isStrPalindrome;

    }

    public static void main(String[] args) {


        Task1 task1=new Task1();
        boolean result=task1.isPalindrome("Kate");
        System.out.println(result);


    }

}
