import java.util.*;
import java.lang.Character;

public class passwordStrengthChecker {

    private static String getRemark(int strength) {
        String remark ="";
        switch (strength) {
            case 1:
                remark = "That's a very bad password.\n" + " Change it as soon as possible.";
                break;
            case 2:
                remark = "That's a weak password.\n" + " You should consider using a tougher password.";
                break;
            case 3:
                remark = "Your password is okay, but it can be improved";
                break;
            case 4:
                remark = "Your password is hard to guess. But you could make it even more secure.";
                break;
            case 5:
                remark = "Now that's one great password!!! Hackers don't have a much chance guessing that password!";
                break;
        
            default:
                remark = "Error wrong password strength value";
                break;
        }

    return remark;

    }

    private static void getPasswordStrength(String password) {
        int strength =0;
        int lowerCount=0, upperCount=0, specialCount=0, numCount=0, wspaceCount = 0;
        char [] charArray = password.toCharArray();

        for (int i=0; i<charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                upperCount++;
            } else if (Character.isLowerCase(charArray[i])) {
                lowerCount++;
            } else if (Character.isDigit(charArray[i])) {
                numCount++;
            } else if (charArray[i]== ' ') {
                wspaceCount++;
            } else {
                specialCount++;
            }
        }

        if (lowerCount>=1) strength++;
        if (upperCount>=1) strength++;
        if (numCount>=1) strength++;
        if (wspaceCount>=1) strength++;
        if (specialCount>=1) strength++;
        
        if(password.length() < 5) strength = 1;

        String remark = getRemark(strength);
        System.out.println(" -------- Your password has --------- ");
        System.out.println("Lower Case: " + lowerCount);
        System.out.println("Upper Case: " + upperCount);
        System.out.println("Digits: " + numCount);
        System.out.println("blank spaces: " + wspaceCount);
        System.out.println("Special Case: " + specialCount);
        System.out.println("Remark: " + remark);
    }
    public static void main(String[] args) {
        String errorMessage = "Please enter password to test: passwordStrengthChecker.java 'Password'";

        if(args.length != 1) {
            System.out.println(errorMessage);
            return;
        }
        String password = args[0];
        System.out.println(password);
        getPasswordStrength(password);
    }
}
