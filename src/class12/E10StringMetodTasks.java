package class12;

public class E10StringMetodTasks {
    public static void main(String[] args) {

        //Store username, password and confirm password from a user and check following requirements:
        //
        //Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //
        //Only after all requirements met → message “Your username and password has been created”

        String UserName="Kate";
        String password="123rd";
        String passwordConfirm="123";
        if(UserName.isEmpty()&&password.isEmpty()){
            System.out.println("cannot be empty");
;
        }else if(password.length()<8){
            System.out.println("too short");
        }else if(password.contains("Kate")){
            System.out.println("Cannot contain username");
        }else if(!password.equals(passwordConfirm)){
            System.out.println("Password dont match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
