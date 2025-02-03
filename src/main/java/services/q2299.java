package services;

public class q2299 {

    //2299

    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        char prevChar = '\0';
        for (char ch : password.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                hasLower = true;
            if (ch >= 'A' && ch <= 'Z')
                hasUpper = true;
            if (Character.isDigit(ch))
                hasDigit = true;
            if ("!@#$%^&*()-+".indexOf(ch) != -1) hasSpecial = true;

            if(ch == prevChar) return false;
            prevChar = ch;
        }
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
