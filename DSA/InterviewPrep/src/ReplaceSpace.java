class Main4 {
    public static void main(String[] args) {
        String url = "https://docs.google.com/spread sheets/d/1CiQtfe1d 6kgGl 220y";
        int n = url.length();

        char str[] = new char[3*n]; // size is 3*n so that it can hold the modified string.
        for(int i=0;i<n;i++) str[i] = url.charAt(i);

        replaceSpace(str,n);

        for (int i = 0; i < 3*n && str[i]!='\0'; i++) {
            System.out.print(str[i]);
        }
    }

    // T - O(n) S - O(1).
    // Note -
    // 1. In Java, String object is immutable, so we need to use a char array.
    // 2. Also, the size of char array should be such that it can hold the modified string.
    static void replaceSpace(char[] url, int n) {
        // trivial case
        if (n == 0) return;

        // count the number of spaces
        int spaceCount = 0;
        for (int i = 0; i < n && url[i]!='\0'; i++) {
            if (url[i] == ' ') spaceCount++;
        }

        // moving the chars of the url in place and adding %20 instead of spaces
        // we need to start moving from the right end
        for(int i=n-1;i>=0 && spaceCount>0;i--) {
            int movedIndex = i + 2 * spaceCount;
            if (url[i] == ' ') {
                url[movedIndex] = '0';
                url[movedIndex - 1] = '2';
                url[movedIndex - 2] = '%';
                spaceCount--;
            } else {
                url[movedIndex] = url[i];
            }
        }
    }

//    // T - O(n) S - O(n).
//    static String replaceSpace(String url) {
//        int n = url.length();
//
//        // trivial case
//        if (n == 0) return url;
//
//        StringBuilder modifiedURL = new StringBuilder(3 * n);
//
//        for (int i = 0; i < n; i++) {
//            if (url.charAt(i) == ' ') {
//                modifiedURL.append("%20");
//            } else {
//                modifiedURL.append(url.charAt(i));
//            }
//        }
//
//        return modifiedURL.toString();
//    }
}
