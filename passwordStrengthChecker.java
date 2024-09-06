

public class passwordStrengthChecker {


    public static void main(String[] args) {
        String errorMessage = "Please enter password to test: passwordStrengthChecker.java 'Password'";

        if(args.length != 1) {
            System.out.println(errorMessage);
            return;
        }
        String password = args[0];
        System.out.println(password);

    }
}
