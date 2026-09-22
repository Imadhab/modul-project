package org.example;

public class PasswordValidator {

    public static boolean hasMinLength(String password, int min){
        if (password == null){
            return false;
        }
        return password.length() >= min;
    }

    public static boolean containsDigit(String password){
        char[] chars = password.toCharArray();

        for (char c : chars){
            if (c>= '0' && c<= '9'){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLower(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;

        char[] chars = password.toCharArray();

        for (char c : chars) {
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }

            if (c >= 'a' && c <= 'z') {
                hasLower = true;
            }
        }

        return hasUpper && hasLower;
    }

    public static boolean isCommonPassword(String password){
        String[] commonPasswords = {
                "password",
                "Passwort1",
                "123456",
                "12345678",
                "qwerty",
                "admin"
        };

        for (String common : commonPasswords) {
            if (password.equals(common)) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsSpecialChar(String password, String allowed){
        char[] chars = password.toCharArray();

        for (char c : chars) {
            for (char a : allowed.toCharArray()) {
                if (c == a) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isValid(String password) {
        return hasMinLength(password, 8)
                && containsDigit(password)
                && containsUpperAndLower(password)
                && !isCommonPassword(password);
    }
}
