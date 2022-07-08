class IsEmailValid {
    public static void main(String[] args) {
        System.out.println(isEmailValid("contribute@geeksfor.geeks.org"));
    }

    static boolean isEmailValid(String email) {
        if (email == null || email.length() == 0) return false;

        // if 1st char of email is not a lower/upper alphabet then email is not valid
        if (!isAlphabet(email.charAt(0))) return false;

        // analysing the local part
        int i = 1, n = email.length();
        int specialCharIdx = -1; // to store the index of '_', '-' or '.' if found
        while (i < n && email.charAt(i) != '@') {
            char currChar = email.charAt(i);

            if (currChar == '_' || currChar == '-' || currChar == '.') {
                if (specialCharIdx != -1) {
                    // meaning there are atleast 2 of such special chars in the local part which is not allowed
                    return false;
                }
                specialCharIdx = i;
            } else if (!isAlphabet(currChar) && !isDigit(currChar)) return false; // encountered invalid character
            i++;
        }

        int atIdx = i;
        if (atIdx == n || atIdx - 1 == specialCharIdx) {
            // if @ wasnt found or special char occurs just before @ then email is invalid
            return false;
        }

        // analysing the domain part
        i++;
        int hyphenIdxMin = n, hyphenIdxMax = -1; // to store the indices of '-' if found
        int dotIdxMin = n, dotIdxMax = -1; // to store the indices of '.' if found
        boolean hasAnAlphabet = false;
        while (i < n) {
            char currChar = email.charAt(i);

            if (isAlphabet(currChar)) hasAnAlphabet = true;
            else if (isDigit(currChar)) ;
            else if (currChar == '-') {
                if (hasConsecSpecialChar(email, n, i)) {
                    return false;
                }
                hyphenIdxMin = Math.min(hyphenIdxMin, i);
                hyphenIdxMax = Math.max(hyphenIdxMax, i);
            } else if (currChar == '.') {
                if (hasConsecSpecialChar(email, n, i)) {
                    return false;
                }
                dotIdxMin = Math.min(dotIdxMin, i);
                dotIdxMax = Math.max(dotIdxMax, i);
            } else {
                // invalid char
                return false;
            }
            i++;
        }

        if (!hasAnAlphabet || dotIdxMin - 1 == atIdx || hyphenIdxMin - 1 == atIdx || dotIdxMax == n - 1 || hyphenIdxMax == n - 1 || dotIdxMax == -1) {
            return false;
        }

        return true;
    }

    static boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean hasConsecSpecialChar(String email, int n, int i) {
        // consecutive hyphens or '.' , '-' found which is invalid
        return ((i > 0 && (email.charAt(i - 1) == '.' || email.charAt(i - 1) == '-')) || (i < n - 1 && (email.charAt(i - 1) == '.' || email.charAt(i - 1) == '-')));
    }
}
